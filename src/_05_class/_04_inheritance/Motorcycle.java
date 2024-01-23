package _05_class._04_inheritance;

public class Motorcycle extends Vehicle{
    private char licenseType;

    public Motorcycle(String brand, String model, int year, char licenseType) {
        super(brand, model, year);
        this.licenseType = licenseType;
    }

    public void horn() {
        System.out.println("경적소리를 냅니다.");
    }

    @Override
    public String toString() {
        return ("Motorcycle {brand: " + getBrand() + ", model: " + getModel() +
                ", year: " + getYear() + ", licenseType: " + licenseType + "}");
    }
}
