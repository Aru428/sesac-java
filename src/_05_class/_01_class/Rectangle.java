package _05_class._01_class;

import java.util.ArrayList;
import java.util.Scanner;

public class Rectangle {
    private int width;
    private int height;

//    public Rectangle(int width, int height) {
//        // 지역변수랑 필드 변수명이 동일하기 때문에 this 사용해서 필드 값에 접근
//        this.width = width;
//        this.height = height;
//    }

    public int getWidth() { return width; }

    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() { return height; }

    public void setHeight(int height) {
        this.height = height;
    }

    public int area() {
        return width * height;
    }

    static int instance;

    public Rectangle() {
        instance++;
    }

    static int getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ArrayList<Rectangle> rect = new ArrayList<>();

        while (true) {
            System.out.println("가로와 세로 길이를 띄어쓰기 기준으로 입력해주세요: ");

            int width = sc.nextInt();
            int height = sc.nextInt();

            if (width == 0 && height == 0) break;

            Rectangle rectangle = new Rectangle();
            rectangle.setWidth(width);
            rectangle.setHeight(height);
            rect.add(rectangle);
        }

        for (Rectangle r : rect) {
            System.out.println("가로 길이는: " + r.getWidth());
            System.out.println("세로 길이는: " + r.getHeight());
            System.out.println("넓이는: " + r.area());
            System.out.println("---------------------------------");
        }

        System.out.println("Rectangle 인스턴스의 개수는: " + Rectangle.getInstance());

        // 입력 받은 값으로 Rectangle 객체 생성
        // Rectangle rectangle = new Rectangle(width, height);
        // System.out.println("사각형의 넓이: " + rectangle.area());

        sc.close();
    }
}
