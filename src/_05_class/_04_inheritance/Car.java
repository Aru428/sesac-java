package _05_class._04_inheritance;

public class Car extends Vehicle{
    private boolean convertible;

    public Car(String brand, String model, int year, boolean convertible) {
        super(brand, model, year);
        this.convertible = convertible;
    }

    public void park() {
        System.out.println("주차했습니다.");
    }

    @Override
    public String toString() {
        return ("Car {brand: " + getBrand() + ", model: " + getModel() +
                ", year: " + getYear() + ", convertible: " + convertible + "}");
    }
}
