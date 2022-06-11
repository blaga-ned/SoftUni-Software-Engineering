package Exam_4.PreExam_3;

import java.util.Scanner;

public class CatLife_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String catName = scanner.nextLine();
        String sex = scanner.nextLine();

        double months = 0;

        if (catName.equals("British Shorthair")) {
            if (sex.equals("m")) {
                months = (13 * 12) * 1.0 / 6;
            } else if (sex.equals("f")) {
                months = (14 * 12) * 1.0 / 6;
            }

        } else if (catName.equals("Siamese")) {
            if (sex.equals("m")) {
                months = (15 * 12) * 1.0 / 6;

            } else if (sex.equals("f")) {
                months = (16 * 12) * 1.0 / 6;
            }

        } else if (catName.equals("Persian")) {
            if (sex.equals("m")) {
                months = (14 * 12) * 1.0 / 6;

            } else if (sex.equals("f")) {
                months = (15 * 12) * 1.0 / 6;

            }

        } else if (catName.equals("Ragdoll")) {
            if (sex.equals("m")) {
                months = (16 * 12) * 1.0 / 6;

            } else if (sex.equals("f")) {
                months = (17 * 12) * 1.0 / 6;

            }

        } else if (catName.equals("American Shorthair")) {
            if (sex.equals("m")) {
                months = (12 * 12) * 1.0 / 6;

            } else if (sex.equals("f")) {
                months = (13 * 12) * 1.0 / 6;

            }

        } else if (catName.equals("Siberian")) {
            if (sex.equals("m")) {
                months = (11 * 12) * 1.0 / 6;

            } else if (sex.equals("f")) {
                months = (12 * 12) * 1.0 / 6;

            }

        }
        if (!catName.equals("British Shorthair") && !catName.equals("Siamese")
                && !catName.equals("Persian") && !catName.equals("Ragdoll")
                && !catName.equals("American Shorthair") && !catName.equals("Siberian")) {
            System.out.printf("%s is invalid cat!", catName);
        }else{
            System.out.printf("%.0f cat months", Math.floor(months));
        }

    }
}
