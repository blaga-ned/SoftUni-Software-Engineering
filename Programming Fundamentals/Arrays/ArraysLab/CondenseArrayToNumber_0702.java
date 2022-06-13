package Arrays.ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber_0702 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int[] condensedArray = new int[array.length - 1];

        for (int i = 0; i < array.length; i++) {
            if (array.length == 1) {
                break;
            }
            if (i == array.length - 1){
                int[] newCondensed = new int[condensedArray.length - 1];
                i = -1;
                array = condensedArray;
                condensedArray = newCondensed;
            }else{
                condensedArray[i] = array[i] + array[i+1];
            }
        }
        System.out.println(array[0]);
    }
}
