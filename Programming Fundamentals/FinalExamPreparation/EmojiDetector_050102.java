package FinalExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector_050102 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String emojisRegex = "(:{2}|\\*{2})(?<emojis>[A-Z][a-z]{2,})\\1";
        String numbersRegex = "\\d";

        Pattern emojis = Pattern.compile(emojisRegex);
        Pattern numbers = Pattern.compile(numbersRegex);

        Matcher emojisMatcher = emojis.matcher(text);
        Matcher numbersMatcher = numbers.matcher(text);
        List<String> coolEmojis = new ArrayList<>();
        int count = 0;
        long coolThreshold = 1;
        while (numbersMatcher.find()) {
            int currentCoolNumber = Integer.parseInt(numbersMatcher.group());
            coolThreshold *= currentCoolNumber;
        }
        while (emojisMatcher.find()) {
            int totalEmojis = 0;
            count++;
            String currentEmojis = emojisMatcher.group();
            for (int i = 0; i < currentEmojis.length(); i++) {
                char currentSymbol = currentEmojis.charAt(i);
                if (Character.isLetter(currentSymbol)){
                totalEmojis += currentSymbol;
                }
            }
            if (totalEmojis > coolThreshold) {
                coolEmojis.add(currentEmojis);
            }
        }
        System.out.println("Cool threshold: " + coolThreshold);
        System.out.println(count + " emojis found in the text. The cool ones are: ");
        for (String coolEmoji : coolEmojis) {
            System.out.println(coolEmoji);
        }

    }
}
