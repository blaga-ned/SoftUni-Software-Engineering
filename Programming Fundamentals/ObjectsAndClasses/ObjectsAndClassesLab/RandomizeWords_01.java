package ObjectsAndClasses.ObjectsAndClassesLab;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RandomizeWords_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> words = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        Random rnd = new Random();
        while (words.size() > 0) {
            String word = words.remove(rnd.nextInt(words.size()));
            System.out.println(word);
        }

    }
}
