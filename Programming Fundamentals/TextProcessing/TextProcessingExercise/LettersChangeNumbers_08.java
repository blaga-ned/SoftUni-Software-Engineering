package TextProcessing.TextProcessingExercise;


import java.util.Scanner;

public class LettersChangeNumbers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] passwords = scanner.nextLine().split("\\s+");
        double totalSum = 0;
        for (String password : passwords) {
            double modifiedNumber = getModifiedNumber(password);
            totalSum += modifiedNumber;
        }
        System.out.printf("%.2f", totalSum);

    }

    private static double getModifiedNumber(String password) {
        char firstLetter = password.charAt(0);
        char secondLetter = password.charAt(password.length() - 1);
        StringBuilder sb = new StringBuilder(password);
        //parvi nachin
        double number = Double.parseDouble(sb.deleteCharAt(0).deleteCharAt(sb.length() - 1).toString());
        //vtori nachin
        //double number1 = Double.parseDouble(sb.replace(firstLetter, ' ').replace(secondLetter, ' ').trim());
        //treti nachin
        //double number2 = Double.parseDouble(sb.substring(1, sb.indexOf(secondLetter)));

        if (Character.isUpperCase(firstLetter)) {
            int positionUpperLetter = (int) firstLetter - 64;
            number = number / positionUpperLetter;
        } else if (Character.isLowerCase(firstLetter)) {
            int positionLowerLetter = (int) firstLetter - 96;
            number = number * positionLowerLetter;
        }
        if (Character.isUpperCase(secondLetter)){
            int positionUpperLetter = (int) secondLetter - 64;
            number = number - positionUpperLetter;

        }else if (Character.isLowerCase(secondLetter)){
            int positionLowerLetter = (int) secondLetter - 96;
            number = number + positionLowerLetter;
        }
        return number;

    }
}
