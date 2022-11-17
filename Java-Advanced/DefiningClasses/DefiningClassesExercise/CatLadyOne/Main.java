package DefiningClasses.DefiningClassesExercise.CatLadyOne;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        HashMap<String, Cymric> cymricHashMap = new HashMap<>();
        HashMap<String, Siamese> siameseHashMap = new HashMap<>();
        HashMap<String, StreetExtraordinaire> streetExtraordinaireHashMap = new HashMap<>();

        while (!input.equals("End")){
            String[] catData = input.split("\\s+");
            String catBreed = catData[0];
            String catName = catData[1];

            switch (catBreed){
                case "Siamese":
                    double earSize = Double.parseDouble(catData[2]);
                    Siamese siamese = new Siamese(catName, earSize);
                    siameseHashMap.put(catName, siamese);
                    break;
                case "Cymric":
                    double furLength = Double.parseDouble(catData[2]);
                    Cymric cymric = new Cymric(catName, furLength);
                    cymricHashMap.put(catName, cymric);
                    break;
                case "StreetExtraordinaire":
                    double decibelsOfMeows = Double.parseDouble(catData[2]);
                    StreetExtraordinaire streetExtraordinaire = new StreetExtraordinaire(catName, decibelsOfMeows);
                    streetExtraordinaireHashMap.put(catName, streetExtraordinaire);
                    break;
            }
            input = scanner.nextLine();
        }
        String catNameToSearch = scanner.nextLine();
        if (siameseHashMap.containsKey(catNameToSearch)){
            System.out.println(siameseHashMap.get(catNameToSearch));
        }else if (cymricHashMap.containsKey(catNameToSearch)){
            System.out.println(cymricHashMap.get(catNameToSearch));
        }else if (streetExtraordinaireHashMap.containsKey(catNameToSearch)){
            System.out.println(streetExtraordinaireHashMap.get(catNameToSearch));
        }

    }
}
