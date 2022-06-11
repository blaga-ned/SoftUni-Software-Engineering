package LoopsForWhileAndNested_3.ForLoopLab_1;

import java.util.Scanner;

public class VowelsSum_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int sum = 0;
        for (int position = 0; position <= text.length() - 1; position++) {
            char letter = text.charAt(position);
            if (letter == 'a') {
                sum += 1;
            } else if (letter == 'e') {
                sum += 2;
            } else if (letter == 'i') {
                sum += 3;
            }else if (letter == 'o'){
                sum += 4;
            }else if (letter == 'u'){
                sum += 5;
            }

        }
        System.out.println(sum);
    }
}
