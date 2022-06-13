package BasicSyntaxConditionalStatementAndLoops.Exercise;

import java.util.Scanner;

public class PadawanEquipment_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double priceOfLight = Double.parseDouble(scanner.nextLine());
        double priceOfRobe = Double.parseDouble(scanner.nextLine());
        double priceOfBelt = Double.parseDouble(scanner.nextLine());

        double totalLights = 0;
        double totalRobes = 0;
        double totalBelts = 0;
        double totalSpend = 0;

        totalLights = Math.ceil(countStudents + 0.10 * countStudents) * priceOfLight;
        totalRobes = priceOfRobe * countStudents;
        totalBelts = (countStudents - (countStudents/6)) * priceOfBelt;

        totalSpend = totalLights + totalRobes + totalBelts;

        if (totalSpend <= amountOfMoney) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalSpend);
        } else {
            double diff = totalSpend - amountOfMoney;
            System.out.printf("George Lucas will need %.2flv more.", diff);

        }


    }
}
