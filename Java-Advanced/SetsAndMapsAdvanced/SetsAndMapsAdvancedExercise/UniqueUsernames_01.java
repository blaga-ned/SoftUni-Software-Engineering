package SetsAndMapsAdvancedExercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Set<String> userNameSet = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            String userName = scanner.nextLine();
            userNameSet.add(userName);
        }
        for (String s : userNameSet) {
            System.out.println(s);
        }
        //moje da se printira i s forEach taka:
        //userNameSet.forEach(System.out::println);
    }
}
