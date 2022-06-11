package LoopsForWhileAndNested_3.WhileLoopLab_4;

import java.util.Scanner;

public class Moving_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wight = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int space = 0;
        int totalSpace = 0;

        while (!input.equals("Done")){
            int boxes = Integer.parseInt(input);

            space = wight*length*height;
            totalSpace+=boxes;
            if (totalSpace>=space){
                break;
            }
            input = scanner.nextLine();
        }



        if (input.equals("Done")){
            System.out.println((space-totalSpace) +" Cubic meters left.");
        }else if (totalSpace>=space){
            System.out.println("No more free space! You need " + (totalSpace-space)  +" Cubic meters more.");
        }


    }
}
