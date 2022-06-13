package BasicSyntaxConditionalStatementAndLoops.BasicSyntaxConditionalStatementAndLoopsLab;

import java.util.Scanner;

public class BackIn30Minutes_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalMinutes = (hours * 60) + minutes + 30;
        int newHours = totalMinutes / 60;
        int newMinutes = totalMinutes % 60;

        if (newHours < 24){
            System.out.printf("%d:%02d",newHours,newMinutes);
        }else{
            newHours = 0;
            System.out.printf("%d:%02d",newHours,newMinutes);
        }


    }
}
