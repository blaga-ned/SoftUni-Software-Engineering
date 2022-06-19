package StacksAndQueues.StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithAStack_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        ArrayDeque<String> stack = new ArrayDeque<>();

        for (String number : input) {
            stack.push(number);
        }
        for (String s : stack) {
            System.out.print(s + " ");
        }


    }
}
