package AssociativeArrays.AssociativeArraysLab;


import java.util.*;
import java.util.stream.Collectors;

public class Largest3Numbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String result = Arrays.stream(scanner.nextLine().split(" "))
                .map(e -> Integer.parseInt(e))
                .sorted((l, r) -> r.compareTo(l))
                .limit(3)
                .map(e -> e.toString())
                .collect(Collectors.joining(" "));

        System.out.println(result);



    }
}
