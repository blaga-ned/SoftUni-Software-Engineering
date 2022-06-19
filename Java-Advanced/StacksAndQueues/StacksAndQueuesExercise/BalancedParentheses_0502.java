package StacksAndQueues.StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses_0502 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<Character> openBrackets = new ArrayDeque<>();
        ArrayDeque<Character> closedBrackets = new ArrayDeque<>();
        boolean areBalanced = false;

        for (int i = 0; i < input.length(); i++) {
            char currentBracket = input.charAt(i);

            if (currentBracket == '{' || currentBracket == '[' || currentBracket == '(') {
                openBrackets.push(currentBracket);
            }
            if (currentBracket == '}' || currentBracket == ']' || currentBracket == ')') {
                closedBrackets.offer(currentBracket);
            }
        }
        if ((openBrackets.isEmpty() || closedBrackets.isEmpty()) || (openBrackets.size() != closedBrackets.size())) {
            System.out.println("NO");

        } else {
            while (!openBrackets.isEmpty() && !closedBrackets.isEmpty()) {
                char lastOpen = openBrackets.pop();
                char firstClosed = closedBrackets.poll();

                if (lastOpen == '{' && firstClosed == '}') {
                    areBalanced = true;
                } else if (lastOpen == '[' && firstClosed == ']') {
                    areBalanced = true;
                } else if (lastOpen == '(' && firstClosed == ')') {
                    areBalanced = true;
                } else {
                    areBalanced = false;
                    break;
                }
            }
            if (areBalanced) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }

    }
}
