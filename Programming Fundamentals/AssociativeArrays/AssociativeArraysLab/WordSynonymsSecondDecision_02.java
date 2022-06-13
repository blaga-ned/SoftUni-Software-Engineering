package AssociativeArrays.AssociativeArraysLab;

import java.util.*;

public class WordSynonymsSecondDecision_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, ArrayList<String>> words = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            words.putIfAbsent(word,new ArrayList<>());
            words.get(word).add(synonym);
        }
        for (Map.Entry<String, ArrayList<String>> wordEntry : words.entrySet()){
            String currentWord = wordEntry.getKey();
            List<String> synonymsForCurrentWord = wordEntry.getValue();
            System.out.printf("%s - %s%n", currentWord, String.join(", ",synonymsForCurrentWord));
        }
    }
}
