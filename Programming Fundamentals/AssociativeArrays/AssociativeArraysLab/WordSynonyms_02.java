package AssociativeArrays.AssociativeArraysLab;

import java.util.*;

public class WordSynonyms_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfWords = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> synonymDictionary = new LinkedHashMap<>();

        for (int i = 0; i < countOfWords; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();
            if (!synonymDictionary.containsKey(word)) {
                List<String> synonymsForCurrentWord = new ArrayList<>();
                synonymsForCurrentWord.add(synonym);
                synonymDictionary.put(word, synonymsForCurrentWord);
            } else {
                List<String> synonymsForCurrentWord = synonymDictionary.get(word);
                synonymsForCurrentWord.add(synonym);
                synonymDictionary.put(word, synonymsForCurrentWord);
            }
        }
        for (Map.Entry<String, List<String>> wordEntry : synonymDictionary.entrySet()){
            String currentWord = wordEntry.getKey();
            List<String> synonymsForCurrentWord = wordEntry.getValue();
            System.out.printf("%s - %s%n", currentWord, String.join(", ",synonymsForCurrentWord));
        }

    }
}
