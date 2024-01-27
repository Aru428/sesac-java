package _05_class._10_collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CollectionEx {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력하세요. -1을 입력하면 종료됩니다.");
        while (true) {
            System.out.printf("정수 입력: ");
            int num = sc.nextInt();
            if (num == -1) break;
            hashSet.add(num);
        }
        System.out.println("중복 제거된 정수 목록: " + hashSet);
        sc.close();
    }
}
