package Lists.ListsExercise;

import java.util.*;

public class HouseParty_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int commandNum = Integer.parseInt(scanner.nextLine());
        List<String> names = new ArrayList<>();

        for (int i = 1; i <= commandNum; i++) {
            String text = scanner.nextLine();
            String[] textData = text.split("\\s+");
            String name = textData[0];

            if (textData[2].equals("going!")){
                if (names.contains(name)){
                    System.out.printf("%s is already in the list!%n", name);
                }else{
                    names.add(name);
                }
            }else if (textData[2].equals("not")){
                if (names.contains(name)){
                    names.remove(name);
                }else{
                    System.out.printf("%s is not in the list!%n", name);
                }
            }
        }
        for (String name : names) {
            System.out.println(name);
        }
    }
}
