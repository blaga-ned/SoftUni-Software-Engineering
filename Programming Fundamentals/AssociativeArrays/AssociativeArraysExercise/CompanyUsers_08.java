package AssociativeArrays.AssociativeArraysExercise;

import java.util.*;

public class CompanyUsers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> companies = new TreeMap<>();
        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String companyName = command.split(" -> ")[0];
            String id = command.split(" -> ")[1];

            if (!companies.containsKey(companyName)) {
                companies.put(companyName, new ArrayList<>());
                companies.get(companyName).add(id);
            } else {
                if (!companies.get(companyName).contains(id)) {
                    companies.get(companyName).add(id);
                }

            }
            command = scanner.nextLine();
        }
        companies.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            for (String e : entry.getValue()) {
                System.out.println("-- " + e);
            }
        });


    }
}
