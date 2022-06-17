package FinalExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper_0202 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "(?<separator>[=\\/])(?<destination>[A-Z][A-Za-z]{2,})\\1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        List<String> destinations = new ArrayList<>();
        while (matcher.find())  {
            destinations.add(matcher.group("destination"));


        }
        int travelPoints = destinations.stream().mapToInt(String::length).sum();
        String resultText = String.join(", ",destinations);

        System.out.printf("Destinations: %s%n", resultText);
        System.out.printf("Travel Points: %d", travelPoints);

    }
}
