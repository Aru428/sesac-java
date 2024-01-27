package _05_class._10_collection;

import java.util.*;

public class CollectionEx2 {
    public static void main(String[] args) {
        Map<String, Integer> user = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("이름과 나이를 입력하세요. '종료'를 입력하면 종료됩니다.");
        while(true) {
            System.out.printf("이름 입력: ");
            String name = sc.next();
            if (name.equals("종료")) {
                System.out.println();
                break;
            }
            System.out.printf("나이 입력: ");
            int age = sc.nextInt();
            user.put(name, age);
        }

        sc.close();
        System.out.println("== 입력 받은 이름과 나이 목록 ==");

        // 1. iterator 사용
        Set<Map.Entry<String, Integer>> entrySet = user.entrySet();
        Iterator<Map.Entry<String,Integer>> iterator = entrySet.iterator();
        while(iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.printf("이름: %s, 나이: %d\n", entry.getKey(), entry.getValue());
        }

        // 2. entrySet() 이용해서 for 문 사용
        for (Map.Entry<String, Integer> entry : user.entrySet()) {
            System.out.println("이름: " + entry.getKey() + ", 나이: " + entry.getValue());
        }
    }
}
