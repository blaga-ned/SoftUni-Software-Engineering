package Lists.ListsExercise;

import java.util.*;
import java.util.stream.Collectors;

public class AppendArrays_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<String> list = Arrays.stream(input.split("\\|")).collect(Collectors.toList());
        Collections.reverse(list);

        System.out.print(list.toString()
                .replace("[", "")
                .replace("]", "")
                .replaceAll(",", "")
                .trim()
                .replaceAll("\\s+", " "));
    }
}
