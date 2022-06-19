package StreamsFilesAndDirectories.StreamsFilesAndDirectoriesExercise;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class LineNumbers_05 {
    public static void main(String[] args) throws IOException {

        String input = "C:\\Users\\User\\IdeaProjects\\JavaAdvanced2022\\src\\StreamsFilesAndDirectoriesExercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt";
        String output = "output-0501.txt";

        List<String> allLines = Files.readAllLines(Path.of(input));
        PrintWriter writer = new PrintWriter(output);
        int number = 1;
        for (String line : allLines){
            writer.println(number + ". " + line);
            number++;
        }
        writer.close();
    }
}
