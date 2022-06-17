package FinalExamPreparation;

import java.util.*;

public class PlantDiscovery_020203 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> plantRarity = new HashMap<>();
        Map<String, List<Double>> rating = new HashMap<>();
        Map<String, Double> averageRating = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("<->");
            String plant = input[0];
            int rarity = Integer.parseInt(input[1]);
            plantRarity.compute(plant, (k, v) -> rarity);
            rating.putIfAbsent(plant, new ArrayList<>());
        }
        String text = scanner.nextLine();
        while (!text.equals("Exhibition")) {
            String[] data = text.split(": ");
            String commandName = data[0];
            String[] tokens = data[1].split(" - ");
            String plantName = tokens[0];

            if (!plantRarity.containsKey(plantName)) {
                System.out.println("error");
                continue;
            }
            switch (commandName) {
                case "Rate":
                    double rate = Double.parseDouble(tokens[1]);
                    rating.get(plantName).add(rate);
                    break;
                case "Update":
                    int update = Integer.parseInt(tokens[1]);
                    plantRarity.compute(plantName, (k, v) -> update);
                    break;
                case "Reset":
                    rating.get(plantName).clear();
                    break;
                default:
                    System.out.println("error");
                    break;
            }
            text = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        plantRarity
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue()
                .thenComparingDouble(x -> rating.get(x.getKey()).stream().mapToDouble(Double::doubleValue)
                        .average()
                        .orElse(0.0))
                        .reversed())
                .forEach(e -> System.out.printf("- %s; Rarity: %d; Rating: %.2f%n",
                e.getKey(), e.getValue(), rating.get(e.getKey()).stream().mapToDouble(Double::doubleValue)
                        .average()
                                .orElse(0.0)));
        double average = 0.0;


    }

}
