package ConditionalStatements_2.ConditionalStatementsAdvanced_03;

import java.util.Scanner;

public class InvalidNumber10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());

       if ((a<=99) || (a>=201)){
           if (a!=0){
               System.out.println("invalid");
           }
       }
    }
}
