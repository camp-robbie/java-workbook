package main.java.workbook2.array;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // TODO: arr에 n개의 정수 저장 후 역순으로 출력
        // N을 입력받아 크기 N의 정수형 배열을 선언하고, 배열의 요소를 거꾸로 입력받아 출력하는 프로그램을 작성하시오.
        // 배열을 뒤집어서 출력합니다.

        // N을 입력받아 크기 N의 정수형 배열을 선언
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 배열의 요소를 거꾸로 입력받아 출력 (배열 선언과 반대로 생각하면 됨)
        // n-1인 이유는 배열의 인덱스가 0부터 시작하기 떄문
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}