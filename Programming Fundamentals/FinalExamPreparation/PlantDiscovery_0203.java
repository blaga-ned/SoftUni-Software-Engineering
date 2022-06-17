package FinalExamPreparation;

import java.util.*;

public class PlantDiscovery_0203 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> plantRarity = new LinkedHashMap<>();
        Map<String, List<Double>> plantRating = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] text = scanner.nextLine().split("<->");
            String plantName = text[0];
            int rarity = Integer.parseInt(text[1]);

            plantRarity.compute(plantName, (k, v) -> rarity);
            plantRating.putIfAbsent(plantName, new ArrayList<>());

            if (!plantRarity.containsKey(plantName)) {
                System.out.println("error");
            }
        }
        String input = scanner.nextLine();
        while (!input.equals("Exhibition")) {
            String[] data = input.split(": ");
            String commandName = data[0];
            String[] commandInf = data[1].split(" - ");
            String name = commandInf[0];
            if (!plantRarity.containsKey(commandInf[0])) {
                System.out.println("error");
                continue;
            }
            switch (commandName) {
                case "Reset":
                    plantRating.get(data[1]).clear();
                    break;

                case "Rate":
                    double number = Double.parseDouble(commandInf[1]);
                    plantRating.get(name).add(number);
                    break;

                case "Update":
                    int numberToUpdate = Integer.parseInt(commandInf[1]);
                    plantRarity.compute(name, (k, v) -> numberToUpdate);
                    break;

                default:
                    System.out.println("error");
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        plantRarity.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue()
                .thenComparingDouble(x -> plantRating.get(x.getKey()).stream()
                        .mapToDouble(Double::doubleValue)
                        .average().orElse(0.0))
                .reversed())
                .forEach(entry -> System.out.println(String.format("- %s; Rarity: %d; Rating: %.2f",
                        entry.getKey(), entry.getValue(),
                        plantRating.get(entry.getKey()).stream()
                                .mapToDouble(Double::doubleValue)
                                .average().orElse(0.0))));

    }
}
