package SetsAndMapsAdvancedExercise;

import java.util.*;

public class PeriodicTable_0302 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Set<String> uniqueElements = new TreeSet<>();
        for (int i = 1; i <= n; i++) {
            String[] chemicalElements = scanner.nextLine().split("\\s+");
            //1.nachin obhojdame s edin cikal i gi dobaviame v seta
            //for (String el : chemicalElements) {
            //    uniqueElements.add(el);
            //}
            //2.nachin e kogato masiva go pravim na list s Arrays.asList i gi dobaviame v seta
            //Collections.addAll(Arrays.asList(chemicalElements), uniqueElements);

            //3. nachin
            uniqueElements.addAll(Arrays.asList(chemicalElements));
        }
        uniqueElements.forEach(el -> System.out.print(el + " "));
    }
}
