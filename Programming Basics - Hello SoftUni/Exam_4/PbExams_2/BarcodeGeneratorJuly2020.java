package Exam_4.PbExams_2;

import java.util.Scanner;

public class BarcodeGeneratorJuly2020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        int min1 = (a / 1000) % 10;
        int max1 = (b / 1000) % 10;
        int min2 = (a / 100) % 10;
        int max2 = (b / 100) % 10;
        int min3 = (a / 10) % 10;
        int max3 = (b / 10) % 10;
        int min4 = a % 10;
        int max4 = b % 10;

        for (int i = min1; i <= max1; i++) {
            for (int j = min2; j <= max2; j++) {
                for (int k = min3; k <= max3; k++) {
                    for (int l = min4; l <= max4; l++) {
                        int number = i * 1000 + j * 100 + k * 10 + l;

                        if (i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && l % 2 != 0) {
                            System.out.printf("%d ", number);
                        }

                    }

                }

            }

        }
    }
}
