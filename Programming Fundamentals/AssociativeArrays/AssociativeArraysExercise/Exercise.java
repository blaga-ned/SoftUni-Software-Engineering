package AssociativeArrays.AssociativeArraysExercise;

import java.util.*;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> plants = new HashMap<>();
        Map<String, List<Double>> rating = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("<->");
            String plant = input[0];
            int rarity = Integer.parseInt(input[1]);
            plants.compute(plant, (k, v) -> rarity);
            rating.put(plant, new ArrayList<>());

        }
        String input;
        while (!"Exhibition".equalsIgnoreCase(input = scanner.nextLine())) {
            String[] tokens = input.split(": ");
            String command = tokens[0];
            String[] elements = tokens[1].split(" - ");
            String name = elements[0];

            if (!plants.containsKey(name)) {
                System.out.println("error");
                continue;
            }
            if (command.equalsIgnoreCase("rate")) {
                double rate = Double.parseDouble(elements[1]);
                rating.get(name).add(rate);
            } else if (command.equalsIgnoreCase("update")) {

                int newRarity = Integer.parseInt(elements[1]);
                plants.compute(name, (k, v) -> newRarity);

            } else if (command.equalsIgnoreCase("reset")) {
                rating.get(name).clear();
            } else {
                System.out.println("error");
            }
        }
        System.out.println("Plants for the exhibition:");
        plants.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue()
                .thenComparingDouble(x -> rating.get(x.getKey())
                        .stream()
                        .mapToDouble(Double::doubleValue)
                        .average().orElse(0.0))
                        .reversed())
                .forEach(entry -> System.out.printf("- %s; Rarity: %d; Rating: %.2f%n",
                        entry.getKey(), entry.getValue(),
                        rating.get(entry.getKey()).stream().mapToDouble(Double::doubleValue)
                                .average().orElse(0.0)));


    }
}

