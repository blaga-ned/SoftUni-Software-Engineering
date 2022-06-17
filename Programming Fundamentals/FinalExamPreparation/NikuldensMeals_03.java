package FinalExamPreparation;

import java.util.*;

public class NikuldensMeals_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> map = new HashMap<>();
        int unlikedMeals = 0;

        while (!input.equals("Stop")) {
            String[] command = input.split("-");
            String commandType = command[0];
            String guestName = command[1];
            String mealName = command[2];

            if (commandType.equals("Like")) {

                map.putIfAbsent(guestName, new ArrayList<>());

                List<String> guestMeals = map.get(guestName);

                if (!guestMeals.contains(mealName)) {
                    guestMeals.add(mealName);
                }
                map.put(guestName, guestMeals);
            } else {
                if (!map.containsKey(guestName)) {
                    System.out.println(guestName + " is not at the party.");
                }
                List<String> meals = map.get(guestName);
                if (!meals.contains(mealName)) {
                    System.out.println(guestName + " doesn't have the " + mealName + " in his/her collection");
                } else {
                    unlikedMeals++;
                    System.out.println(guestName + " doesn't like the " + mealName);
                    meals.remove(mealName);
                    map.put(guestName, meals);
                }
            }
            input = scanner.nextLine();
        }
        map.entrySet().stream().sorted((left, right)-> {
            int res = right.getValue().size() - left.getValue().size();
            if (res == 0){
                return left.getKey().compareTo(right.getKey());
            }else{
                return res;
            }
        }).forEach(e -> System.out.println(e.getKey() + " : " + e.getValue().toString().replaceAll("[\\[\\]]", "")));
        System.out.println("Unliked meals: " + unlikedMeals);
    }
}
