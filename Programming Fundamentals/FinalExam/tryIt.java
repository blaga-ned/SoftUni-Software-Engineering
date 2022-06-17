package FinalExam;

import java.util.Locale;
import java.util.Scanner;

public class tryIt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


                String text = scanner.nextLine();
                String input = scanner.nextLine();
                while (!input.equals("End")) {
                    String[] commandData = input.split(" ");
                    String commandName = commandData[0];
                    switch (commandName) {
                        case "Translate":
                            String letter = commandData[1];
                            String replacement = commandData[2];
                            text = text.replaceAll(letter, replacement);
                            System.out.println(text);
                            break;
                        case "Includes":
                            String checkSubstring = commandData[1];
                            if (text.contains(checkSubstring)) {
                                System.out.println("True");
                            } else {
                                System.out.println("False");
                            }
                            break;
                        case "Start":
                            String checkStart = commandData[1];
                            String[] array = text.split(" ");
                            String word = array[0];
                            if (checkStart.equals(word)){
                                System.out.println("True");
                            }else{
                                System.out.println("False");
                            }

                            break;
                        case "Lowercase":
                            text = text.toLowerCase(Locale.ROOT);
                            System.out.println(text);
                            break;
                        case "FindIndex":
                            String findIndex = commandData[1];
                            int indexFind = text.lastIndexOf(findIndex);
                            System.out.println(indexFind);
                            break;
                        case "Remove":
                            int startIndex = Integer.parseInt(commandData[1]);
                            int count = Integer.parseInt(commandData[2]);
                            int endIndexD = startIndex + count;
                            String textToRemove = text.substring(startIndex, endIndexD);
                            text = text.replace(textToRemove, "");
                            System.out.println(text);
                            break;
                    }


                    input = scanner.nextLine();
                }
            }
        }
