package _04_exception;

public class Practice1 {
    public static void main(String[] args) {
        // 예외 처리 실습
        int[] arr = {1, 2, 3, 4};

        try {
            for (int i=0; i<5 ; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스가 범위를 벗어났습니다.");
        }



    }
}
