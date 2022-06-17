package FinalExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords_0302 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String regex = "([@|#])(?<wordOne>[A-Za-z]{3,})\\1\\1(?<wordTwo>[A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        List<String> words = new ArrayList<>();
        int count = 0;


        while (matcher.find()) {
            String wordOne = matcher.group("wordOne");
            String wordTwo = matcher.group("wordTwo");
            count++;
            StringBuilder sb = new StringBuilder(wordTwo);
            sb = sb.reverse();
            if (sb.toString().equals(wordOne)){
                words.add(wordOne + " <=> " + wordTwo);
            }
        }
        if (count != 0) {
            System.out.printf("%d word pairs found!%n", count);
        } else {
            System.out.println("No word pairs found!");
        }
        if ( count > 0 && words.size()  > 0) {
            System.out.println("The mirror words are:");
            System.out.print(String.join(", ", words));
        }else {
            System.out.println("No mirror words!");
        }

    }
}
