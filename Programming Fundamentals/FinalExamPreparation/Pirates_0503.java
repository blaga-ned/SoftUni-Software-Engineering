package FinalExamPreparation;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Pirates_0503 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> cityPopulation = new TreeMap<>();
        Map<String, Integer> cityGold = new TreeMap<>();
        String input = scanner.nextLine();

        while (!input.equals("Sail")) {
            String[] data = input.split("\\|\\|");
            String cityName = data[0];
            int population = Integer.parseInt(data[1]);
            int gold = Integer.parseInt(data[2]);

            cityPopulation.putIfAbsent(cityName, 0);
            int newPopulation = cityPopulation.get(cityName) + population;
            cityPopulation.put(cityName, newPopulation);
            cityGold.putIfAbsent(cityName, 0);
            int newGold = cityGold.get(cityName) + gold;
            cityGold.put(cityName, newGold);

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
                    cityPopulation.put(town, cityPopulation.get(town) - people);
                    cityGold.put(town, cityGold.get(town) - gold);
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", town, gold, people);
                    if (cityPopulation.get(town) <= 0 || cityGold.get(town) <= 0) {
                        System.out.printf("%s has been wiped off the map!%n", town);
                        cityPopulation.remove(town);
                        cityGold.remove(town);
                    }
                    break;

                case "Prosper":
                    String townName = commandData[1];
                    int goldToAdd = Integer.parseInt(commandData[2]);
                    if (goldToAdd < 0) {
                        System.out.println("Gold added cannot be a negative number!");
                    } else {
                        int totalGold = cityGold.get(townName) + goldToAdd;
                        cityGold.put(townName, totalGold);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", goldToAdd, townName, totalGold);
                    }
                    break;
            }
            text = scanner.nextLine();

        }

    }
}
