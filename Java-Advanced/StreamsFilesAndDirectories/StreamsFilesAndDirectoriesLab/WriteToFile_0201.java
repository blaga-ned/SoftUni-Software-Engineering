package StreamsFilesDirectoriesLab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;

public class WriteToFile_0201 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pathIn = "C:\\Users\\Admin\\IdeaProjects\\JavaAdvanced\\src\\StreamsFilesDirectoriesLab\\Resources\\input.txt";
        String pathOut = "C:\\Users\\Admin\\IdeaProjects\\JavaAdvanced\\src\\StreamsFilesDirectoriesLab\\Resources\\02.WriteToFileOutput.txt";

        try(FileInputStream fileInputStream = new FileInputStream(pathIn); FileOutputStream out = new FileOutputStream(pathOut)) {
            int bytes = fileInputStream.read();
            Set<Character> punctualTable = Set.of('.',',','!','?');

            while (bytes != -1) {

                char symbol = (char) bytes;
                boolean isPunctuation = punctualTable.contains(symbol);

                if (!isPunctuation) {
                    out.write(symbol);
                }
                bytes = fileInputStream.read();
            }
        }catch (IOException e){
            System.out.println("IO Exception");
        }
    }
}
