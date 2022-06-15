package RegularExpression.RegularExpressionExercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> racers = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        Map<String, Integer> racersDistances = new LinkedHashMap<>();
        racers.forEach(racer -> racersDistances.put(racer, 0));
        Pattern patternLetter = Pattern.compile("[A-Za-z]+");
        Pattern patternDigit = Pattern.compile("[0-9]");
        String input = scanner.nextLine();
        while (!input.equals("end of race")) {
            StringBuilder nameBuilder = new StringBuilder();
            Matcher matcherName = patternLetter.matcher(input);
            while (matcherName.find()){
                nameBuilder.append(matcherName.group());
            }
            int distance = 0;
            Matcher matcherDigit = patternDigit.matcher(input);
            while (matcherDigit.find()){
                distance += Integer.parseInt(matcherDigit.group());
            }
            String racerName = nameBuilder.toString();
            if (racersDistances.containsKey(racerName)){
                int currentDistance = racersDistances.get(racerName);
                racersDistances.put(racerName, currentDistance + distance);
            }

            input = scanner.nextLine();
        }

    }
}
