package _05_class._03_final;

import java.util.Scanner;

public class Circle {
    private final double radius;
    static final double PI = 3.141592;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() { return radius; }

    public double calculateArea() { return radius * radius * PI; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("원의 반지름을 입력하세요: ");
        double r = sc.nextDouble();

        Circle circle1 = new Circle(r);
        System.out.println("원의 반지름: " + circle1.getRadius());
        System.out.println("원의 넓이: " + circle1.calculateArea());

        sc.close();
    }
}
