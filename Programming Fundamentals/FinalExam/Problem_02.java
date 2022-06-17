package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < n; i++) {
            String regex = "^([%\\$])(?<tag>[A-Z][a-z]{2,})\\1: \\[(?<one>\\d+)\\]\\|\\[(?<two>\\d+)\\]\\|\\[(?<three>\\d+)\\]\\|$";
            String text = scanner.nextLine();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);
            if (matcher.find()){
                String tag = matcher.group("tag");
                int one = Integer.parseInt(matcher.group("one"));
                int two = Integer.parseInt(matcher.group("two"));
                int three = Integer.parseInt(matcher.group("three"));
                char symbolOne = (char)(one);
                char symbolTwo = (char)(two);
                char symbolThree = (char)(three);
                String first = Character.toString(symbolOne);
                String second = Character.toString(symbolTwo);
                String third = Character.toString(symbolThree);
                String word = first + second + third;
                System.out.println(tag + ": " + word);
            }else{
                System.out.println("Valid message not found!");
            }
        }

    }
}
