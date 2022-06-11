package LoopsForWhileAndNested_3.WhileLoopExercise_5;

import java.util.Scanner;

public class OldBooks_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String searchedBook = scanner.nextLine();

        String input = scanner.nextLine();

        boolean isFound = false;
        int count = 0;
        while (!input.equals("No More Books")){

            if (input.equals(searchedBook)){
                isFound = true;
                break;

            }
            count++;

            input = scanner.nextLine();
        }

        if (isFound){
            System.out.printf("You checked %d books and found it." ,count);

        }else{
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", count);

        }


    }
}
