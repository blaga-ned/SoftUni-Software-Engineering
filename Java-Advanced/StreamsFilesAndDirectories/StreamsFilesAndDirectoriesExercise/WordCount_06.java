package StreamsFilesAndDirectories.StreamsFilesAndDirectoriesExercise;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCount_06 {
    public static void main(String[] args) throws IOException {

        String pathWords = "C:\\Users\\User\\IdeaProjects\\JavaAdvanced2022\\src\\StreamsFilesAndDirectoriesExercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt";

        Map<String, Integer> countWords = new HashMap<>();
        List<String> allLinesWords = Files.readAllLines(Path.of(pathWords));
        for (String lineWords : allLinesWords) {
            Arrays.stream(lineWords.split("\\s+")).forEach(
                    word -> {
                        countWords.put(word, 0);
                    }
            );
        }
        String path = "C:\\Users\\User\\IdeaProjects\\JavaAdvanced2022\\src\\StreamsFilesAndDirectoriesExercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\text.txt";
        List<String> allLines = Files.readAllLines(Path.of(path));
        for (String line : allLines){
            Arrays.stream(line.split("\\s+")).forEach(
                    word -> {
                        if (countWords.containsKey(word)){
                            int currentCount = countWords.get(word) + 1;
                            countWords.put(word, currentCount);
                        }
                    }
            );
        }
        PrintWriter writer = new PrintWriter("results.txt");
        countWords.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(entry -> writer.println(entry.getKey() + " - " + entry.getValue()));

        writer.close();
    }
}

