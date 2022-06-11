package ConditionalStatements_2.ConditionalStatementsAdvanced_03;

import java.util.Scanner;

public class CinemaTicket_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayOfWeek = scanner.nextLine();

        if(dayOfWeek.equals("Monday")||dayOfWeek.equals("Tuesday")||dayOfWeek.equals("Friday")){
            System.out.println(12);
        }else if(dayOfWeek.equals("Saturday")||dayOfWeek.equals("Sunday")){
            System.out.println(16);
        }else if (dayOfWeek.equals("Wednesday")||dayOfWeek.equals("Thursday")){
            System.out.println(14);
        }
    }
}
