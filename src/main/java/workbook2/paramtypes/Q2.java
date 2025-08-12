package main.java.workbook2.paramtypes;

import java.util.Scanner;

public class Q2 {
    // TODO: addHundred 메서드 작성 (int[] arr의 첫 요소에 100을 더함)
    public static void addHundred(int[] arr) {
        arr[0] = arr[0] + 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        addHundred(arr);

        // TODO: 변경된 arr 출력
        // 참조형 매개변수의 경우 메서드 내 수정이 호출한 곳에도 반영됨을 확인합니다.
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}