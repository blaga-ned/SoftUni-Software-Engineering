package TextProcessing.TextProcessingLab;

import java.util.Scanner;

public class TextFilter_0402 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

       for (String bannedWord : bannedWords){
           if (text.contains(bannedWord)){
               String replacementWord = repeatString("*", bannedWord.length());
              text = text.replace(bannedWord, replacementWord);

              //moje i taka bez metod text = text.replace(bannedWord, bannedWord.repeat(bannedWord.length));
           }
       }
        System.out.println(text);

    }
    public static String repeatString (String word, int count){
        String[] repeatArr = new String[count];
        for (int i = 0; i < count; i++) {
            repeatArr[i] = word;
        }
        return String.join("", repeatArr);
    }
}
