package StreamsFilesAndDirectories.StreamsFilesAndDirectoriesExercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SumLines_0102 {
    public static void main(String[] args) throws IOException {

        String pathInput = "C:\\Users\\User\\IdeaProjects\\JavaAdvanced2022\\src\\StreamsFilesAndDirectoriesExercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        List<String> allLines = Files.readAllLines(Path.of(pathInput));

        allLines.stream()
                .map(line -> line.toCharArray())
                .forEach(line -> {
                    int sum = 0;
                    for (char symbol : line){
                        sum += symbol;
                    }
                    System.out.println(sum);
                });
    }
}
