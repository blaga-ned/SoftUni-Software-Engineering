package LoopsForWhileAndNested_3.WhileLoopExercise_5;

import java.util.Scanner;

public class Coins_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double change = Double.parseDouble(scanner.nextLine());

        double coins = change*100;
        int counter = 0;
        while (coins > 0){
            if (coins>=200){
                counter++;
                coins-=200;
            }else if (coins>=100){
                counter++;
                coins-=100;
            }else if (coins>=50){
                counter++;
                coins-=50;
            }else if (coins>=20){
                counter++;
                coins-=20;
            }else if (coins>=10){
                counter++;
                coins-=10;
            }else if (coins>=5){
                counter++;
                coins-=5;
            }else if (coins>=2){
                counter++;
                coins-=2;
            }else if (coins>=1){
                counter++;
                coins-=1;
            }else{
                break;
            }
        }
        System.out.println(counter);
    }
}
