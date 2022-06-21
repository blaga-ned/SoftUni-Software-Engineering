package SetsAndMapsAdvanced.SetsAndMapsAdvancedLab;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> parkingLot = new LinkedHashSet<>();
        String input = scanner.nextLine();

        while (!input.equals("END")){
            String[] tokens = input.split(", ");
            String carNumber = tokens[1];

            if (tokens[0].equals("IN")){
                parkingLot.add(carNumber);
            }else if (tokens[0].equals("OUT")){
                parkingLot.remove(carNumber);
            }

            input = scanner.nextLine();
        }
        if (parkingLot.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }
        for (String s : parkingLot) {
            System.out.println(s);
        }


    }
}
