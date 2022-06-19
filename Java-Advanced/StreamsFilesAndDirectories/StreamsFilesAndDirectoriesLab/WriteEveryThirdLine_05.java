package StreamsFilesAndDirectories.StreamsFilesAndDirectoriesLab;

import javax.annotation.processing.FilerException;
import java.io.*;
import java.util.Scanner;

public class WriteEveryThirdLine_05 {
    public static void main(String[] args) throws IOException {

        String inPath = "C:\\Users\\User\\IdeaProjects\\JavaAdvanced2022\\src\\StreamsFilesAndDirectoriesLab\\Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outPath = "C:\\Users\\User\\IdeaProjects\\JavaAdvanced2022\\src\\StreamsFilesAndDirectoriesLab\\Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\05.WriteEveryThirdLineOutput.txt";

        Scanner in = new Scanner(new FileReader(inPath));
        PrintWriter out = new PrintWriter(new FileWriter(outPath));

        int counter = 1;
        String line = in.nextLine();
        while (in.hasNextLine()) {
            if (counter % 3 == 0) {
                out.println(line);
            }
            counter++;
            line = in.nextLine();
        }
        out.close();
        //moje i s -> out.flush();

    }
}
