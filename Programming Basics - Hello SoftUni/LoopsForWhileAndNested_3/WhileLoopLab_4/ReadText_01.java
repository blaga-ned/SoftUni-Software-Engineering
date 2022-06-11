package LoopsForWhileAndNested_3.WhileLoopLab_4;

import java.util.Scanner;

public class ReadText_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            String name = scanner.nextLine();
            if (name.equals("Stop")){
                break;
            }
            System.out.println(name);
        }

    }
}
