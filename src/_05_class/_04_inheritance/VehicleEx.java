package _05_class._04_inheritance;

import java.util.ArrayList;

public class VehicleEx {
    public static void main(String[] args) {
        Bus bus = new Bus("Hyundai", "City Bus", 2022, 30);
        Car car = new Car("Toyota", "Camry", 2023, true);
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2021, 'A');

        System.out.println("=== Bus 정보 ===");
        System.out.println(bus.toString());
        bus.start();
        bus.carry();
        bus.stop();

        System.out.println("=== Car 정보 ===");
        System.out.println(car.toString());
        car.start();
        car.park();
        car.stop();

        System.out.println("=== Motorcycle 정보 ===");
        System.out.println(motorcycle.toString());
        motorcycle.start();
        motorcycle.horn();
        motorcycle.stop();
    }
}
