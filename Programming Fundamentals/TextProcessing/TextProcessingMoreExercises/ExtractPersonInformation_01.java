package TextProcessing.TextProcessingMoreExercises;

import java.util.Scanner;

public class ExtractPersonInformation_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String words = scanner.nextLine();

            int firstIndexName = words.indexOf("@");
            int lastIndexName = words.indexOf("|");

            String name = words.substring(firstIndexName +1, lastIndexName);

            int firstIndexAge = words.indexOf("#");
            int lastIndexAge = words.indexOf("*");

            String age = words.substring(firstIndexAge+1, lastIndexAge);

            System.out.printf("%s is %s years old.%n", name, age);

        }
    }
}
