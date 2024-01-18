package _02_control_statement;

public class Practice3 {
    public static void main(String[] args) {
        Practice3 ol = new Practice3();

        System.out.println("반지름이 5인 원의 넓이: " + ol.getArea(5));
        System.out.println("가로 4, 세로 7인 직사각형의 넓이: " + ol.getArea(4, 7));
        System.out.println("밑변 6, 높이 3인 삼각형의 넓이: " + ol.getArea(6.0,3.0));
    }

    public double getArea(double a) {return Math.PI * a * a;}
    public double getArea(int a, int b) {return a * b;}
    public double getArea(double a, double b) {return a * b / 2;}
}
