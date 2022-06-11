package LoopsForWhileAndNested_3.ForLoopMoreExercises_3;

import java.util.Scanner;

public class GameOfIntervals_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numSteps = Integer.parseInt(scanner.nextLine());
        double result = 0;;
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int invalid = 0;

        for (int i = 1; i <= numSteps ; i++) {
            double number = Integer.parseInt(scanner.nextLine());
            if (number>=0 && number<=50){
                if (number<=9){
                    number*=0.2;
                    n1++;
                }else if (number<=19){
                    number*=0.3;
                    n2++;
                }else if (number<=29){
                    number*=0.4;
                    n3++;
                }else if (number<=39){
                    number=50;
                    n4++;
                }else{
                    number=100;
                    n5++;
                }
                result+=number;

            }else{
                result/=2;
                invalid++;
            }

        }
        double percentN1 = n1*1.0 / numSteps*100;
        double percentN2 = n2*1.0 / numSteps*100;
        double percentN3 = n3*1.0 / numSteps*100;
        double percentN4 = n4*1.0 / numSteps*100;
        double percentN5 = n5*1.0 / numSteps*100;
        double percentInvalid = invalid*1.0/numSteps*100;

        System.out.printf("%.2f%n",result);
        System.out.printf("From 0 to 9: %.2f%%%n",percentN1);
        System.out.printf("From 10 to 19: %.2f%%%n",percentN2);
        System.out.printf("From 20 to 29: %.2f%%%n",percentN3);
        System.out.printf("From 30 to 39: %.2f%%%n",percentN4);
        System.out.printf("From 40 to 50: %.2f%%%n",percentN5);
        System.out.printf("Invalid numbers: %.2f%%",percentInvalid);


    }
}
