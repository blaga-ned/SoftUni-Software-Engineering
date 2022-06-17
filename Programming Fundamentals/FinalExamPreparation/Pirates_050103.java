package FinalExamPreparation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pirates_050103 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Integer> populationMap = new HashMap<>();
        Map<String, Integer> goldMap = new HashMap<>();

        while (!input.equals("Sail")) {
            String[] inputData = input.split("\\|\\|");
            String city = inputData[0];
            int population = Integer.parseInt(inputData[1]);
            int gold = Integer.parseInt(inputData[2]);
            populationMap.putIfAbsent(city, 0);
            int totalPopulation = populationMap.get(city) + population;
            populationMap.put(city, totalPopulation);
            goldMap.putIfAbsent(city, 0);
            int totalGold = goldMap.get(city) + gold;
            goldMap.put(city, totalGold);

            input = scanner.nextLine();
        }
        String text = scanner.nextLine();
        while (!text.equals("End")) {
            String[] commandData = text.split("=>");
            String commandName = commandData[0];
            switch (commandName) {
                case "Plunder":
                    String town = commandData[1];
                    int people = Integer.parseInt(commandData[2]);
                    int gold = Integer.parseInt(commandData[3]);
                    int peopleResult = populationMap.get(town) - people;
                    int goldResult = goldMap.get(town) - gold;
                    if (peopleResult <= 0 || goldResult <= 0) {
                        System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n",
                                town, gold, people);
                        System.out.printf("%s has been wiped off the map!%n", town);
                        goldMap.remove(town);
                        populationMap.remove(town);
                    } else {
                        System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n",
                                town, gold, people);
                        populationMap.put(town, peopleResult);
                        goldMap.put(town, goldResult);
                    }

                    break;
                case "Prosper":
                    String prosperTown = commandData[1];
                    int goldToAdd = Integer.parseInt(commandData[2]);
                    if (goldToAdd <= 0) {
                        System.out.println("Gold added cannot be a negative number!");
                    } else {
                        int totalGoldToAdd = goldMap.get(prosperTown) + goldToAdd;
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n",
                                goldToAdd, prosperTown, totalGoldToAdd);
                        goldMap.put(prosperTown, totalGoldToAdd);
                    }
                    break;
            }
            text = scanner.nextLine();
        }
        if (goldMap.isEmpty()) {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        } else {
            int num = goldMap.size();
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", num);
            goldMap.entrySet().stream()
                    .sorted((g1, g2) -> {
                        int result = g2.getValue().compareTo(g1.getValue());
                        if (result == 0) {
                            return g1.getKey().compareTo(g2.getKey());
                        }
                        return result;
                    })
                    .forEach(entry -> {
                        System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n",
                                entry.getKey(), populationMap.get(entry.getKey()), entry.getValue());
                    });
        }
    }
}
