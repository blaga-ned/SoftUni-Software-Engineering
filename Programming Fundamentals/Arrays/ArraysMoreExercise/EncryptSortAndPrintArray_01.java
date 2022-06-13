package Arrays.ArraysMoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfNames = Integer.parseInt(scanner.nextLine());
        int[] array = new int[numberOfNames];

        for (int i = 0; i < numberOfNames; i++) {
            String text = scanner.nextLine();
            int sum1 = 0;
            int totalSum1 = 0;
            int totalSum2 = 0;
            int sum2 = 0;
            int totalSum = 0;
            int length = text.length();
            for (int j = 0; j < text.length(); j++) {
                char currentSymbol = text.charAt(j);
                sum1 = 0;
                sum2 = 0;
                switch (currentSymbol) {
                    case 'a':
                    case 'o':
                    case 'e':
                    case 'u':
                    case 'i':
                    case 'A':
                    case 'O':
                    case 'E':
                    case 'U':
                    case 'I':
                        sum1 += currentSymbol * length;
                        break;
                    default:
                        sum2 += currentSymbol / length;
                        break;
                }
                totalSum1 += sum1;
                totalSum2 += sum2;

            }
            totalSum = totalSum1 + totalSum2;
            array[i] = totalSum;

        }
        Arrays.sort(array);
        for (int element : array) {
            System.out.println(element + " ");
        }
    }
}
