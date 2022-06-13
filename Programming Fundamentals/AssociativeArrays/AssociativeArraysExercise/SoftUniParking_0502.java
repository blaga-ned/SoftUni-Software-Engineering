package AssociativeArrays.AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking_0502 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> licencePlates = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String[] data = scanner.nextLine().split(" ");
            String commandName = data[0];
            String userName = data[1];
            if (commandName.equals("register")) {
                String licenceNumber = data[2];
                if (!licencePlates.containsKey(userName)) {
                    licencePlates.put(userName, licenceNumber);
                    System.out.printf("%s registered %s successfully%n", userName, licenceNumber);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s%n", licenceNumber);
                }

            } else if (commandName.equals("unregister")) {
                if (licencePlates.containsKey(userName)) {
                    licencePlates.remove(userName);
                    System.out.printf("%s unregistered successfully%n", userName);
                } else {
                    System.out.printf("ERROR: user %s not found%n", userName);
                }
            }
        }
        for (Map.Entry<String, String> entry : licencePlates.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

    }
}
