package main.java.workbook2.array;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    // 사용자가 배열 크기(N) 입력
        int[] arr = new int[n];  // 크기가 N인 정수형 배열 선언
        // TODO: arr에 n개의 정수 저장 후 역순으로 출력

        // 정방향 입력받기
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // 배열의 요소를 거꾸로 출력
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i > 0){
                System.out.print(" ");           // 요소 사이 공백 출력
            }
        }
        // 입력 닫기
        sc.close();
    }
}