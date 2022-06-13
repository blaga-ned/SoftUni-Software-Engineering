package AssociativeArrays.AssociativeArraysExercise;

import java.util.*;

public class LegendaryFarming_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> keyMaterials = new HashMap<>();
        Map<String, Integer> junkMaterial = new TreeMap<>();
        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);

        boolean isObtained = false;
        while (!isObtained){
            String[] tokens = scanner.nextLine().split("\\s+");

            for (int i = 0; i < tokens.length; i += 2) {
                int quantity = Integer.parseInt(tokens[i]);
                String material = tokens[i + 1].toLowerCase();

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")){
                    keyMaterials.putIfAbsent(material, 0);
                    keyMaterials.put(material, keyMaterials.get(material) + quantity);
                    if (keyMaterials.get(material) >= 250){
                        keyMaterials.put(material, keyMaterials.get(material) - 250);
                        if (material.equals("shards")){
                            System.out.println("Shadowmourne obtained!");
                        }else if (material.equals("fragments")){
                            System.out.println("Valanyr obtained!");
                        }else {
                            System.out.println("Dragonwrath obtained!");
                        }
                        isObtained = true;
                        break;
                    }
                }else{
                    junkMaterial.putIfAbsent(material, 0);
                    junkMaterial.put(material, junkMaterial.get(material) + quantity);
                }
            }
        }
        keyMaterials.entrySet().stream()
                .sorted((a, b) -> {
                    int result = b.getValue().compareTo(a.getValue());
                    if (result == 0){
                        result = a.getKey().compareTo(b.getKey());
                    }
                    return result;
        }).forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
        junkMaterial.forEach((k,v) -> System.out.println(k + ": " + v));
    }
}
