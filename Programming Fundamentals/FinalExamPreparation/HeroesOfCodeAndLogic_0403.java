package FinalExamPreparation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HeroesOfCodeAndLogic_0403 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> heroesMp = new HashMap<>();
        Map<String, Integer> heroesHp = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String data = scanner.nextLine();

            String[] splitData = data.split("\\s+");
            String heroName = splitData[0];
            int hp = Integer.parseInt(splitData[1]);
            int mp = Integer.parseInt(splitData[2]);

            if (hp <= 100) {
                heroesHp.put(heroName, hp);
            }
            if (mp <= 200) {
                heroesMp.put(heroName, mp);
            }
        }
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] commandParams = command.split(" - ");
            String commandName = commandParams[0];
            String heroName = commandParams[1];

            switch (commandName) {

                case "CastSpell":
                    int mPNeeded = Integer.parseInt(commandParams[2]);
                    String spellName = commandParams[3];
                    int currentMp = heroesMp.get(heroName);
                    if (currentMp >= mPNeeded){
                        int mpLeft = currentMp - mPNeeded;
                        heroesMp.put(heroName, mpLeft);
                        System.out.printf("%s has successfully cast %s and now has %d MP!", heroName, spellName, mpLeft);
                    }else{
                        System.out.printf("%s does not have enough MP to cast %s!", heroName, spellName);
                    }

                    break;

                case "TakeDamage":
                    int damage = Integer.parseInt(commandParams[2]);
                    String attacker = commandParams[3];
                    break;

                case "Recharge":
                    int amountRecharge = Integer.parseInt(commandParams[2]);
                    break;

                case "Heal":
                    int amountHeal = Integer.parseInt(commandParams[2]);
                    break;
            }


            command = scanner.nextLine();
        }

    }
}
