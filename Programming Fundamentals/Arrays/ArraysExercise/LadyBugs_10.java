package Arrays.ArraysExercise;

import java.util.Scanner;

public class LadyBugs_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] field = new int[n];
        String[] bugsIndexes = scanner.nextLine().split(" ");

        for (int i = 0; i < bugsIndexes.length; i++) {
            field[i] = 1;
        }
        String line = scanner.nextLine();
        while (line.equals("end")) {
            String[] commands = line.split(" ");
            int bugIndex = Integer.parseInt(commands[0]);
            String direction = commands[1];
            int flyLength = Integer.parseInt(commands[2]);

            if (bugIndex < 0 || bugIndex >= field.length || field[bugIndex] != 1) {
                line = scanner.nextLine();
                continue;
            }
            if (direction.equals("right")) {
                field[bugIndex] = 0;
                while (field[bugIndex + flyLength] < field.length && field[bugIndex + flyLength] != 1) {
                    field[bugIndex + flyLength] = 1;
                }
            } else {
                field[bugIndex] = 0;
                while (field[bugIndex - flyLength] > 0 && field[bugIndex - flyLength] != 1) {
                    field[bugIndex - flyLength] = 1;
                }
            }
            line = scanner.nextLine();
        }
        for (int i = 0; i < field.length; i++) {
            System.out.print(field[i] + " ");
        }

    }
}
