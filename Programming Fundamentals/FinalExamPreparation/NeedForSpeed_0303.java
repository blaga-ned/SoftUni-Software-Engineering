package FinalExamPreparation;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class NeedForSpeed_0303 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> mileageMap = new TreeMap<>();
        Map<String, Integer> fuelMap = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\|");
            String carName = data[0];
            int mileage = Integer.parseInt(data[1]);
            int fuel = Integer.parseInt(data[2]);
            mileageMap.put(carName, mileage);
            fuelMap.put(carName, fuel);

        }
        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            String[] commandData = input.split(" : ");
            String commandName = commandData[0];
            switch (commandName) {
                case "Drive":
                    String driveCar = commandData[1];
                    int distance = Integer.parseInt(commandData[2]);
                    int driveFuel = Integer.parseInt(commandData[3]);
                    if (fuelMap.get(driveCar) < driveFuel) {
                        System.out.printf("Not enough fuel to make that ride%n");
                    } else {
                        fuelMap.put(driveCar, fuelMap.get(driveCar) - driveFuel);
                        mileageMap.put(driveCar, mileageMap.get(driveCar) + distance);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n"
                                ,driveCar, distance, driveFuel);
                        if (mileageMap.get(driveCar) >= 100000) {
                            mileageMap.remove(driveCar);
                            fuelMap.remove(driveCar);
                            System.out.printf("Time to sell the %s!%n", driveCar);
                        }
                    }
                    break;
                case "Refuel":
                    String refuelCar = commandData[1];
                    int refuel = Integer.parseInt(commandData[2]);
                    int diff = 75 - fuelMap.get(refuelCar);
                    int result = fuelMap.get(refuelCar) + refuel;
                    if (result > 75 ){
                        fuelMap.put(refuelCar, 75);
                        System.out.printf("%s refueled with %d liters%n",refuelCar, diff);
                    }else{
                        fuelMap.put(refuelCar, result);
                        System.out.printf("%s refueled with %d liters%n", refuelCar, refuel);
                    }
                    break;

                case "Revert":
                    String revertCar = commandData[1];
                    int kilometers = Integer.parseInt(commandData[2]);
                    int resultMileage = mileageMap.get(revertCar) - kilometers;
                    if (resultMileage > 10000){
                        mileageMap.put(revertCar, resultMileage);
                        System.out.printf("%s mileage decreased by %d kilometers%n", revertCar, kilometers);
                    }else{
                        mileageMap.put(revertCar, 10000);
                    }

                    break;

            }
            input = scanner.nextLine();
        }
        mileageMap.entrySet().stream()
                .sorted((m1, m2)-> {
                    int result = m2.getValue().compareTo(m1.getValue());
                    if (result == 0){
                        return m1.getKey().compareTo(m2.getKey());
                    }
                    return result;
                })
                .forEach(entry -> System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n"
                , entry.getKey(), entry.getValue(), fuelMap.get(entry.getKey())));
    }
}
