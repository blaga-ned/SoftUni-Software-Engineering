package StreamsFilesAndDirectories.StreamsFilesAndDirectoriesLab;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class ReadFile_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String path = "C:\\Users\\User\\IdeaProjects\\JavaAdvanced2022\\src\\StreamsFilesAndDirectoriesLab\\Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

      try (InputStream in = new FileInputStream(path)) {
          int oneByte = in.read();
          while (oneByte >= 0){
              System.out.printf("%s ", Integer.toBinaryString(oneByte));
              oneByte = in.read();
          }
      }catch (IOException e){
          System.out.println("IO EXCEPTION");
      }


    }
}
