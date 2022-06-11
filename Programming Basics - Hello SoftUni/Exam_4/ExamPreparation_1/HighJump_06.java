package Exam_4.ExamPreparation_1;

import java.util.Scanner;

public class HighJump_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int target = Integer.parseInt(scanner.nextLine());

        int startHeight = target - 30;
        int totalJumps = 0;

        for (int height = startHeight; height <= target; height += 5) {
            int failedJumps = 0;
            for (int jump = 1; jump <= 3; jump++) {
                int jumpHeight = Integer.parseInt(scanner.nextLine());
                totalJumps++;
                if (jumpHeight > height) {
                    break;
                } else {
                    failedJumps++;
                }
            }
            if (failedJumps == 3) {
                System.out.printf("Tihomir failed at %dcm after %d jumps.", height, totalJumps);
                return;
            }

        }

        System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", target, totalJumps);
    }
}
