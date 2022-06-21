package SetsAndMapsAdvanced.SetsAndMapsAdvancedLab;

import java.text.DecimalFormat;
import java.util.*;

public class AcademyGraduation_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            String[] tokensNumbers = scanner.nextLine().split("\\s+");
            map.put(name, new ArrayList<>());

            for (int j = 0; j < tokensNumbers.length; j++) {
                double number = Double.parseDouble(tokensNumbers[j]);
                map.get(name).add(number);
            }
        }
        map.entrySet().stream()
                .forEach((e-> {
                    double sum = 0;
                    for (int i = 0; i < e.getValue().size(); i++) {
                        sum += e.getValue().get(i);
                    }
                    double average = sum / e.getValue().size();
                    DecimalFormat df = new DecimalFormat("0.#######################################");
                    System.out.println(e.getKey() + " is graduated with " + df.format(average));
                }));

    }
}
