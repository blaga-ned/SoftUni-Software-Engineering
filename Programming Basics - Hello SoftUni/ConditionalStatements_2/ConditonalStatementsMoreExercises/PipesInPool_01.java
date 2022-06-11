package ConditionalStatements_2.ConditonalStatementsMoreExercises_05;

import java.util.Scanner;

public class PipesInPool_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int v = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double totalP1 = p1 * h;
        double totalP2 = p2 * h;
        double totalP1P2 = totalP1 + totalP2;
        double totalP1Percentage = totalP1 * 100 / totalP1P2;
        double totalP2Percentage = totalP2 * 100 / totalP1P2;
        double totalP1P2Percentage = totalP1P2 * 100 / v;
        double diff = totalP1P2 - v;

        if (totalP1P2 <= v){
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.",
                    totalP1P2Percentage, totalP1Percentage, totalP2Percentage);
        }else{
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.",h,diff);
        }
    }
}
