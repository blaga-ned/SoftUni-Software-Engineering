package DefiningClasses.DefiningClassesLab.Constructors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Car> carsCollections = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] carData = scanner.nextLine().split("\\s+");
            String brand = carData[0];
            Car car;

            if (carData.length == 1){
                car = new Car(brand);
            }else{
                String model = carData[1];
                int horsePower = Integer.parseInt(carData[2]);
                car = new Car(brand, model, horsePower);

            }
            carsCollections.add(car);

        }
        carsCollections.forEach(car -> System.out.println(car.carInfo()));
    }
}
