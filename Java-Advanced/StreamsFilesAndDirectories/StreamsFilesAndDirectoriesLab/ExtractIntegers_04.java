package StreamsFilesAndDirectories.StreamsFilesAndDirectoriesLab;

import java.io.*;
import java.util.Scanner;

public class ExtractIntegers_04 {
    public static <myFileOutPut> void main(String[] args) throws FileNotFoundException {

        String inPath = "C:\\Users\\User\\IdeaProjects\\JavaAdvanced2022\\src\\StreamsFilesAndDirectoriesLab\\Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outPath = "C:\\Users\\User\\IdeaProjects\\JavaAdvanced2022\\src\\StreamsFilesAndDirectoriesLab\\Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\04.ExtractIntegersOutput.txt";

        Scanner scanner = new Scanner(new FileInputStream(inPath));
        PrintWriter myFileOutPut = new PrintWriter(new FileOutputStream(outPath));

        while (scanner.hasNext()){
            if (scanner.hasNextInt()){
                int myNumber = scanner.nextInt();
                myFileOutPut.println(myNumber);
            //System.out.println(scanner.nextInt());
            }
            scanner.next();
        }
        myFileOutPut.close();
    }
}
