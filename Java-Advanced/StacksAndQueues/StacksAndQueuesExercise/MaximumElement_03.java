package StacksAndQueues.StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numCommand = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < numCommand; i++) {
            String[] commandTokens = scanner.nextLine().split("\\s+");
            String firstCommand = commandTokens[0];
            switch (firstCommand){
                case "1":
                    stack.push(Integer.parseInt(commandTokens[1]));
                    break;
                case "2":
                    stack.pop();
                    break;
                case "3":
                    System.out.println(Collections.max(stack));
                    break;
            }
        }
    }
}
