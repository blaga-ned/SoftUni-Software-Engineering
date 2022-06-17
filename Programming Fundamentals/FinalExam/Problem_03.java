package FinalExam;

import java.sql.SQLOutput;
import java.util.*;

public class Problem_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> mapHero = new HashMap<>();
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] comand = input.split(" ");
            String commandName = comand[0];

            switch (commandName) {
                case "Enroll":
                    String enrollHero = comand[1];
                    if (!mapHero.containsKey(enrollHero)) {
                        mapHero.put(enrollHero, new ArrayList<>());
                    } else {
                        System.out.printf("%s is already enrolled.%n", enrollHero);
                    }
                    break;
                case "Learn":
                    String learnName = comand[1];
                    String spellName = comand[2];
                    if (!mapHero.containsKey(learnName)) {
                        System.out.printf("%s doesn't exist.%n", learnName);
                        break;
                    }
                    if (mapHero.get(learnName).contains(spellName)) {
                        System.out.printf("%s has already learnt %s.%n", learnName, spellName);

                    } else {
                        mapHero.get(learnName).add(spellName);
                    }
                    break;
                case "Unlearn":
                    String unLearnName = comand[1];
                    String unSpellName = comand[2];
                    if (!mapHero.containsKey(unLearnName)) {
                        System.out.printf("%s doesn't exist.%n", unLearnName);
                        break;
                    }
                    if (!mapHero.get(unLearnName).contains(unSpellName)) {
                        System.out.printf("%s doesn't know %s.%n", unLearnName, unSpellName);

                    } else {
                        mapHero.get(unLearnName).remove(unSpellName);
                    }

                    break;
            }


            input = scanner.nextLine();
        }
        System.out.println("Heroes:");
        mapHero.entrySet().stream().sorted((v1, v2) -> {
            int res = v2.getValue().size() - v1.getValue().size();
            if (res == 0) {
                return v1.getKey().compareTo(v2.getKey());
            } else {
                return res;
            }
        }).forEach(e -> System.out.println("== " + e.getKey() + ": " + String.join(", ", e.getValue())));

    }
}
