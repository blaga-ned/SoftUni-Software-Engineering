package SetsAndMapsAdvanced.SetsAndMapsAdvancedLab;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class SoftUniParty_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        TreeSet<String> vip = new TreeSet<>();
        TreeSet<String> regular = new TreeSet<>();
        while (!input.equals("PARTY")){
            if (input.length() == 8){
                if (Character.isDigit(input.charAt(0))){
                    vip.add(input);
                }else{
                    regular.add(input);
                }
            }

            input = scanner.nextLine();
        }
        String text = scanner.nextLine();
        while (!text.equals("END")){
            if (vip.contains(text)){
                vip.remove(text);
            }else regular.remove(text);
            text = scanner.nextLine();
        }
        System.out.println(vip.size() + regular.size());
        for (String v : vip) {
            System.out.println(v);
        }
        for (String r : regular) {
            System.out.println(r);
        }
    }
}
