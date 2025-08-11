package main.java.workbook2.array;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5]; // 정수형 배열 선언

        // TODO: arr에 5개 정수 저장 후 출력
        // 5개의 정수를 입력받아 순서대로 배열에 저장한 뒤, 배열의 모든 요소를 공백으로 구분하여 출력하는 프로그램을 작성하시오.
        // 정수형 배열을 선언하고 반복문으로 채웁니다.

        // 반복문 (5개의 정수를 입력받아 순서대로 배열에 저장)
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        // 배열의 모든 요소를 공백으로 구분하여 출력
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
