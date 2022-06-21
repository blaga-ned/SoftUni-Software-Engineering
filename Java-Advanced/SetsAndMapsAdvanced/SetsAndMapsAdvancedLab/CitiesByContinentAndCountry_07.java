package SetsAndMapsAdvanced.SetsAndMapsAdvancedLab;

import java.util.*;

public class CitiesByContinentAndCountry_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Map<String, List<String>>> mapData = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] text = scanner.nextLine().split("\\s+");
            String continent = text[0];
            String country = text[1];
            String city = text[2];

            if (!mapData.containsKey(continent)) {
                mapData.put(continent, new LinkedHashMap<>());
                mapData.get(continent).put(country, new ArrayList<>());
                mapData.get(continent).get(country).add(city);
            } else {
                if (!mapData.get(continent).containsKey(country)){
                    mapData.get(continent).put(country, new ArrayList<>());
                    mapData.get(continent).get(country).add(city);
                }else{
                    mapData.get(continent).get(country).add(city);
                }

            }

        }
        for (Map.Entry<String, Map<String, List<String>>> continents : mapData.entrySet()){
            String continent = continents.getKey();
            Map<String, List<String>> countries = continents.getValue();
            System.out.println(continent + ":");

            for (Map.Entry<String, List<String>> country : countries.entrySet()){
                String currentCountry = country.getKey();
                System.out.print(" " + currentCountry + " -> ");
                System.out.println(String.join(", ", country.getValue()));

            }
        }


    }
}
