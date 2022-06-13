package Arrays.ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class MyExercise {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int[] condensedArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array.length == 1){
                break;
            }
            condensedArray[i] = array[i] + array[i + 1];
            i = i - 1;

        }
        array = condensedArray;

        System.out.println(array[0]);

    }
}
