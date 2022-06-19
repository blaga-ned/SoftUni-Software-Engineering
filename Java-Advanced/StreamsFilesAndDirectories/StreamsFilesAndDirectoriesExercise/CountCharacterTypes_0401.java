package StreamsFilesAndDirectories.StreamsFilesAndDirectoriesExercise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountCharacterTypes_0401 {
    public static void main(String[] args) throws IOException {

        String pathIn = "C:\\Users\\User\\IdeaProjects\\JavaAdvanced2022\\src\\StreamsFilesAndDirectoriesExercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String pathOut = "output-0402.txt";

        int vowelsCount = 0;
        int punctCount = 0;
        int consonantCount = 0;
        Set<Character> vowels = getVowels();
        Set<Character> punctuationMarks = getPunctMarks();

        List<String> allLines = Files.readAllLines(Path.of(pathIn));
        for (String line : allLines) {
            for (int i = 0; i < line.length(); i++) {
                char currentSymbol = line.charAt(i);

                if (currentSymbol == ' ') {
                    continue;
                }

                if (vowels.contains(currentSymbol)){
                    vowelsCount++;
                }else if (punctuationMarks.contains(currentSymbol)){
                    punctCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter(pathOut));
        writer.write("Vowels: " + vowelsCount);
        writer.newLine();
        writer.write("Consonants: " + consonantCount);
        writer.newLine();
        writer.write("Punctuation: " + punctCount);
        writer.close();
    }

    private static Set<Character> getPunctMarks() {
        Set<Character> punctMarks = new HashSet<>();
        punctMarks.add('.');
        punctMarks.add(',');
        punctMarks.add('!');
        punctMarks.add('?');
        return punctMarks;
    }

    private static Set<Character> getVowels() {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('o');
        vowels.add('u');
        vowels.add('i');
        return vowels;
    }
}
