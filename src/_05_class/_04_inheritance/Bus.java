package _05_class._04_inheritance;

public class Bus extends Vehicle{
    private int passengerCapacity;

    public Bus(String brand, String model, int year, int passengerCapacity) {
        super(brand, model, year);
        this.passengerCapacity = passengerCapacity;
    }

    public void carry() {
        System.out.println("승객을 운송합니다.");
    }

    @Override
    public String toString() {
        return ("Bus {brand: " + getBrand() + ", model: " + getModel() +
                ", year: " + getYear() + ", passengerCapacity: " + passengerCapacity + "}");
    }
}
