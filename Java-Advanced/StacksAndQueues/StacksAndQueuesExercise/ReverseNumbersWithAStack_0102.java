package StacksAndQueues.StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithAStack_0102 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        ArrayDeque<String> stack = new ArrayDeque<>();

        //drug nachin za palnene na stack e cherz
        // stack.addAll(List.of(input));

        for (String number : input) {
            stack.push(number);
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
    }
}
