package _04_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // 배열 크기 입력
            System.out.println("배열의 크기를 입력하세요.");
            int size = sc.nextInt();

            if (size <= 0) {
                // 예외 처리 코드
                throw new IllegalArgumentException("배열 크기는 1이상이어야 합니다.");
            }

            // 배열 생성
            int[] arr = new int[size];

            // 배열 요소 입력
            System.out.println(size + "개의 정수를 입력하세요.");
            int sum = 0;
            for (int i=0; i<size; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }

            // 평균 계산
            double avg = (double) sum / size;
            System.out.println("평균은 " + avg + "입니다.");
        } catch (InputMismatchException e) {
            System.out.println("잘못된 입력 형식입니다. 정수를 입력하세요.");
        } catch (IllegalArgumentException e) {
            // 런타임 에러
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
