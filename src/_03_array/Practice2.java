package _03_array;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        // ArrayList 실습
        ArrayList<String> array = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("문자를 입력해주세요. :");
            String str = sc.nextLine();
            if(str.equals("exit")) break;

            array.add(str);
        }

        for (String arr : array)
            System.out.println(arr);
        sc.close();
    }
}
