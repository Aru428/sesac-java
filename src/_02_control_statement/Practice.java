package _02_control_statement;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        // 조건문 실습1
        System.out.println("나이를 입력하세요.");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String result;

        if (1 <= age && age <= 7) result = "유아";
        else if (8 <= age && age <= 13) result = "초등학생";
        else if (14 <= age && age <= 16) result = "중학생";
        else if (17 <= age && age <= 19) result = "고등학생";
        else result = "성인";

        System.out.println(result);

        // 조건문 실습2
        System.out.println("이름을 입력하세요");
        String name = sc.next();

        result = switch (name) {
            case "홍길동" -> "남자";
            case "성춘향" -> "여자";
            default -> "모르겠어요";
        };
        System.out.println(result);
        sc.close();
    }
}
