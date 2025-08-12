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
        addHundred(arr); // TODO: addHundred 메서드 작성 후 주석 해제
        // TODO: 변경된 arr 출력
        System.out.println(java.util.Arrays.toString(arr));
    }
}