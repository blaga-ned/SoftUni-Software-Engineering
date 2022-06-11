package ConditionalStatements_2.ConditionalStatementsExercise_02;


import java.util.Scanner;

public class MyExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



                int volumeOfThePool = Integer.parseInt(scanner.nextLine());
                int firstPipe = Integer.parseInt(scanner.nextLine());
                int secondPipe = Integer.parseInt(scanner.nextLine());
                double hours = Double.parseDouble(scanner.nextLine());

                double sum = (firstPipe + secondPipe) * hours;
                double difference = volumeOfThePool - sum;

                if(difference >= 0){
                    double filledVolume = (volumeOfThePool - difference) / (double)volumeOfThePool * 100.0;
                    double firstPipePercent = firstPipe / (double)(firstPipe + secondPipe) * 100.0;
                    double secondPipePercent = secondPipe / (double)(firstPipe + secondPipe) * 100.0;

                    System.out.println("The pool is " + filledVolume + "% full. Pipe 1: " + firstPipePercent + "%. Pipe 2: " + secondPipePercent +"%.");
                }
                else{
                    System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hours, Math.abs(difference));
                }
            }
        }


