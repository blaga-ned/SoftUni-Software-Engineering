package SetsAndMapsAdvanced.SetsAndMapsAdvancedExercise;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UserLogs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        TreeMap<String, LinkedHashMap<String, Integer>> users = new TreeMap<>();
        while (!input.equals("end")){
            String[] inputParts = input.split(" ");
            String userName = inputParts[2].substring(5);
            String ipAddress = inputParts[0].substring(3);

            if (!users.containsKey(userName)){
                users.put(userName, new LinkedHashMap<>());
            }
            if (!users.get(userName).containsKey(ipAddress)){
                users.get(userName).put(ipAddress, 1);
            }else{
                int currentCount = users.get(userName).get(ipAddress) + 1;
                users.get(userName).put(ipAddress, currentCount);
            }
            input = scanner.nextLine();
        }
        for (var attacker : users.entrySet()) {
            System.out.printf("%s:%n", attacker.getKey());
            LinkedHashMap<String, Integer> attacks = attacker.getValue();
            StringBuilder sb = new StringBuilder();
            for (var ipAttack  : attacks.entrySet()) {
                sb.append(String.format("%s => %d, ", ipAttack.getKey(), ipAttack.getValue()));
            }

            String finalOutput = sb.substring(0, sb.length() - 2);

            System.out.println(finalOutput + ".");
        }
    }
}
