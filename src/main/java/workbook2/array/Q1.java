package main.java.workbook2.array;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        // TODO: arr에 5개 정수 저장 후 출력

        // 정수 5개를 순서대로 입력받아 배열(arr)에 저장
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // 배열의 모든 요소 출력 (공백으로 구분)
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);            // 배열의 모든 요소 출력
            if(i < arr.length-1){                // 마지막 요소 아닐 경우에만
                System.out.print(" ");           // 공백 출력(구분)
            }
        }
        // 입력 도구 닫기
        sc.close();
    }
}
