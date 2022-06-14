package Lists.ListsLab;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class MyExercise_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> arrayList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        arrayList.removeIf(n -> n < 0);
        Collections.reverse(arrayList);
        if (arrayList.isEmpty()) {
            System.out.println("empty");
        }else{
        System.out.println(arrayList.toString().replaceAll("[\\[\\],]", ""));

        }

    }
}
