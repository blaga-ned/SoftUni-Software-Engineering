package StreamsFilesAndDirectories.StreamsFilesAndDirectoriesExercise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CountCharacterTypes_04 {
    public static void main(String[] args) throws IOException {

        String pathIn = "C:\\Users\\User\\IdeaProjects\\JavaAdvanced2022\\src\\StreamsFilesAndDirectoriesExercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String pathOut = "output-0401.txt";

        int vowelsCount = 0;
        int punctCount = 0;
        int consonantCount = 0;

        List<String> allLines = Files.readAllLines(Path.of(pathIn));
        for (String line : allLines) {
            for (int i = 0; i < line.length(); i++) {
                char currentSymbol = line.charAt(i);

                if (currentSymbol == ' ') {
                    continue;
                }

                if (currentSymbol == 'a' || currentSymbol == 'e' || currentSymbol == 'i'
                        || currentSymbol == 'o' || currentSymbol == 'u'){
                    vowelsCount++;
                }else if (currentSymbol == '!' || currentSymbol == ',' ||
                        currentSymbol == '.' || currentSymbol == '?'){
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
}
