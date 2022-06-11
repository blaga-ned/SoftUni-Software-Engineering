package ConditionalStatements_2.ConditionalStatementsAdvancedExercises_04;

import java.util.Scanner;

public class OperationsBetweenNumbers_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        double result = 0;
        if (operator.equals("+")){
            result = firstNum+secondNum;
            System.out.printf("%d + %d = %.0f",firstNum,secondNum,result);
            if (result % 2 == 0){
                System.out.println(" - even");
            }else{
                System.out.println(" - odd");
            }
        }else if (operator.equals("-")){
            result = firstNum - secondNum;
            System.out.printf("%d - %d = %.0f", firstNum,secondNum,result);
            if (result % 2 ==0){
                System.out.println(" - even");
            }else{
                System.out.println(" - odd");
            }
        }else if (operator.equals("*")){
            result = firstNum*secondNum;
            System.out.printf("%d * %d = %.0f",firstNum,secondNum,result);
            if (result % 2 == 0){
                System.out.println(" - even");
            }else{
                System.out.println(" - odd");
            }
        }else if (operator.equals("/")){
            if (firstNum == 0){
                System.out.printf("Cannot divide %d by zero",secondNum);
            }else if (secondNum == 0){
                System.out.printf("Cannot divide %d by zero", firstNum);
            }else{
                result = firstNum*1.0/secondNum;
                System.out.printf("%d / %d = %.2f",firstNum,secondNum,result);
            }
        }else if (operator.equals("%")){
            if (firstNum == 0){
                System.out.printf("Cannot divide %d by zero",secondNum);
            }else if (secondNum == 0){
                System.out.printf("Cannot divide %d by zero", firstNum);
            }else{
                result = firstNum % secondNum;
                System.out.printf("%d %% %d = %.0f", firstNum,secondNum,result);
            }
        }
    }
}
