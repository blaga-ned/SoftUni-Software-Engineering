package StreamsFilesAndDirectories.StreamsFilesAndDirectoriesLab;

import java.io.*;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WriteToFile_02 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);

        String pathIn = "C:\\Users\\User\\IdeaProjects\\JavaAdvanced2022\\src\\StreamsFilesAndDirectoriesLab\\Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String pathOut = "C:\\Users\\User\\IdeaProjects\\JavaAdvanced2022\\src\\StreamsFilesAndDirectoriesLab\\Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\02.WriteToFileOutput.txt";
        Set<Character> forbiddenSymbols = new HashSet<>();
        Collections.addAll(forbiddenSymbols, '.', ',', '!', '?');

        try (FileInputStream in = new FileInputStream(pathIn);
             FileOutputStream out = new FileOutputStream(pathOut)){
            int oneByte = in.read();
            while (oneByte >= 0){
                char myByteAsChar = (char)oneByte;
                if (!forbiddenSymbols.contains(myByteAsChar)){
                    out.write(oneByte);
                }
                oneByte = in.read();
            }

        } catch (IOException e) {
        }
    }
}
