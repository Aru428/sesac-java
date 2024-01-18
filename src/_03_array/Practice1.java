package _03_array;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        // 배열 실습
        System.out.println("5개의 정수를 입력하세요");
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int[] arr = new int[5];
        for(int i=0; i<5; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("평균은 " + (double) sum/5);
    }
}
