package _05_class._09_generic;

public class Calculator<T extends Number> {
    private T num1;
    private T num2;

    public Calculator(T num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add() {
        return num1.doubleValue() + num2.doubleValue();
    }

    public static void main(String[] args) {
        Calculator<Integer> cal1 = new Calculator<>(10, 5);
        Calculator<Double> cal2 = new Calculator<>(2.3, 3.34);

        System.out.println("Integer Sum: " + cal1.add());
        System.out.println("Double Sum: " + cal2.add());
    }
}
