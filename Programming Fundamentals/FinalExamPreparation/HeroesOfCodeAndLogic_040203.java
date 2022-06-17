package FinalExamPreparation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HeroesOfCodeAndLogic_040203 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> hpMap = new HashMap<>();
        Map<String, Integer> mpMap = new HashMap<>();


        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] heroData = input.split(" ");
            String name = heroData[0];
            int hp = Integer.parseInt(heroData[1]);
            int mp = Integer.parseInt(heroData[2]);

            hpMap.putIfAbsent(name, 0);
            int newHp = hp + hpMap.get(name);
            hpMap.put(name, newHp);
            mpMap.putIfAbsent(name, 0);
            int newMp = mp + mpMap.get(name);
            mpMap.put(name, newMp);
            if (hpMap.get(name) >= 100) {
                hpMap.put(name, 100);
            }
            if (mpMap.get(name) >= 200) {
                mpMap.put(name, 200);
            }
        }
        String text = scanner.nextLine();
        while (!text.equals("End")) {
            String[] commandData = text.split(" - ");
            String commandName = commandData[0];

            switch (commandName) {
                case "CastSpell":
                    String castHero = commandData[1];
                    int mpNeeded = Integer.parseInt(commandData[2]);
                    String spellName = commandData[3];
                    if (mpMap.get(castHero) >= mpNeeded) {
                        int result = mpMap.get(castHero) - mpNeeded;
                        mpMap.put(castHero, result);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n",
                                castHero, spellName, result);
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", castHero, spellName);

                    }
                    break;
                case "TakeDamage":
                    String takeName = commandData[1];
                    int damage = Integer.parseInt(commandData[2]);
                    String attacker = commandData[3];
                    int res = hpMap.get(takeName) - damage;
                    if (res > 0) {
                        hpMap.put(takeName, res);
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n",
                                takeName, damage, attacker, res);
                    } else {
                        hpMap.remove(takeName);
                        System.out.printf("%s has been killed by %s!%n", takeName, attacker);
                    }

                    break;
                case "Recharge":
                    String getName = commandData[1];
                    int recharge = Integer.parseInt(commandData[2]);
                    int totalRecharge = mpMap.get(getName) + recharge;
                    if (totalRecharge > 200) {
                        int diff = 200 - mpMap.get(getName);
                        System.out.printf("%s recharged for %d MP!%n", getName, diff);
                        mpMap.put(getName, 200);
                    } else {
                        mpMap.put(getName, totalRecharge);
                        System.out.printf("%s recharged for %d MP!%n", getName, recharge);
                    }
                    break;
                case "Heal":
                    String name = commandData[1];
                    int amount = Integer.parseInt(commandData[2]);
                    int totalHeal = hpMap.get(name) + amount;
                    if (totalHeal > 100) {
                        int diff = 100 - hpMap.get(name);
                        System.out.printf("%s healed for %d HP!%n", name, diff);
                        hpMap.put(name, 100);
                    } else {
                        hpMap.put(name, totalHeal);
                        System.out.printf("%s healed for %d HP!%n", name, amount);
                    }
                    break;
            }
            text = scanner.nextLine();
        }
        hpMap.entrySet().stream().sorted((h1, h2)-> {
            int result = h2.getValue().compareTo(h1.getValue());
            if (result == 0){
                return h1.getKey().compareTo(h2.getKey());
            }
            return result;
        }).forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.println("HP: " + entry.getValue());
            System.out.println("MP: " + mpMap.get(entry.getKey()));
        });
    }
}
