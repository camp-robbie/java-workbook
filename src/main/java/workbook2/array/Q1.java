package main.java.workbook2.array;

import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        // TODO: arr에 5개 정수 저장 후 출력

        // 1. for 문 배열 요소 개수 활용 - 배열 입력
        // 배열 요소 개수(i < arr.length)
        // for 문 인덱스 활용 시: i < 5
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            // 마지막 공백 제외 시
            System.out.print(arr[i]);
            if (i != arr.length - 1)
                System.out.print(" ");
            // 마지막 공백 포함 시
//            System.out.print(arr[i] + " ");
        }

        System.out.println();

        sc.close();

    }
}
