package main.java.workbook2.array;

import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        // 5변 반복하는 반복문. 입력을 받습니다.
        for (int i = 0; i < 5 ; i++) {
            arr[i] = sc.nextInt();
        }

        // 출력 예시와 완전히 같은 모습
        for (int i = 0; i < 5 ; i++) {
            System.out.print(arr[i]+" ");
        }

        // 배열 자체를 스트링값으로 변환하여 출력하는 구문
       // System.out.println(Arrays.toString(arr));
    }
}
