package LoopsForWhileAndNested_3.ForLoopMoreExercises_3;

import java.util.Scanner;

public class Hospital_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int doctors = 7;
        int treatedPatients = 0;
        int treatedInPatients = 0;
        int totalTreatedPatients = 0;
        int untreatedPatients = 0;
        int totalUntreatedPatients = 0;
        int allTreatedInPatients = 0;

        for (int i = 1; i <= days; i++) {
            if (i % 3 == 0 && totalUntreatedPatients > totalTreatedPatients) {
                doctors += 1;
            }
            int numPatients = Integer.parseInt(scanner.nextLine());
            if (doctors < numPatients) {
                untreatedPatients = numPatients - doctors;
                totalUntreatedPatients += untreatedPatients;
                treatedInPatients = numPatients - untreatedPatients;
                allTreatedInPatients += treatedInPatients;

            } else {
                treatedPatients += numPatients;

            }
            totalTreatedPatients = treatedPatients + allTreatedInPatients;
        }
        System.out.printf("Treated patients: %d.%n", totalTreatedPatients);
        System.out.printf("Untreated patients: %d.%n", totalUntreatedPatients);


    }
}
