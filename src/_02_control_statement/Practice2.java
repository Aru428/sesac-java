package _02_control_statement;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        System.out.println("숫자 두 개를 입력하세요");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("덧셈 결과 : " + add(a, b));
        System.out.println("뺄셈 결과 : " + sub(a, b));
        System.out.println("나눗셈 결과 : " + div(a, b));
        System.out.println("곱셈 결과 : " + mul(a, b));
    }

    public static double add(double a, double b) {return a + b;}
    public static double sub(double a, double b) {return a - b;}
    public static double mul(double a, double b) {return a * b;}
    public static double div(double a, double b) {return a / b;}
}
