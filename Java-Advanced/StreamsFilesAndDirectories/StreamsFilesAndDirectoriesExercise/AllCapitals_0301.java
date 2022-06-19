package StreamsFilesAndDirectories.StreamsFilesAndDirectoriesExercise;

import java.io.*;
import java.util.Locale;

public class AllCapitals_0301 {
    public static void main(String[] args) throws IOException {

        String pathIn = "C:\\Users\\User\\IdeaProjects\\JavaAdvanced2022\\src\\StreamsFilesAndDirectoriesExercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        BufferedWriter writer = new BufferedWriter(new FileWriter("output-0301.txt"));
        BufferedReader reader = new BufferedReader(new FileReader(pathIn));
        String line = reader.readLine();
        while (line != null){
            writer.write(line.toUpperCase(Locale.ROOT));
            writer.newLine();

            line = reader.readLine();
        }
        writer.close();

    }
}
