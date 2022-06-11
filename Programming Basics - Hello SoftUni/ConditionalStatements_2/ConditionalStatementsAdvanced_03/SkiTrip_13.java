package ConditionalStatements_2.ConditionalStatementsAdvanced_03;

import java.util.Scanner;

public class SkiTrip_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String typeRoom = scanner.nextLine();
        String guestReview = scanner.nextLine();

        int nights = days - 1;
        double pricePerNight = 0;

        if (typeRoom.equals("room for one person")) {
            pricePerNight = 18.00;
        } else if (typeRoom.equals("apartment")) {
            pricePerNight = 25.00;
        } else if (typeRoom.equals("president apartment")) {
            pricePerNight = 35.00;
        }
        double sum = pricePerNight * nights;

        if (typeRoom.equals("apartment")) {
            if (days < 10) {
                sum = sum - sum * 0.30;
            } else if (days >=10 && days <= 15) {
                sum = sum - sum * 0.35;
            }else if (days>15){
                sum = sum - sum*0.50;
            }
        }else if (typeRoom.equals("president apartment")){
            if (days<10){
                sum = sum - sum * 0.10;
            }else if (days>=10 && days<=15){
                sum = sum - sum * 0.15;
            }else if (days>15){
                sum = sum - sum * 0.20;
            }
        }

        if (guestReview.equals("positive")){
            sum = sum + 0.25*sum;

        }else if (guestReview.equals("negative")){
            sum = sum - 0.10*sum;
        }
        System.out.printf("%.2f",sum);


    }

}



