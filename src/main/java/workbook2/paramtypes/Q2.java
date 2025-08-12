package main.java.workbook2.paramtypes;

import java.util.Scanner;
// 배열을 매개변수로 받아 첫 번째 요소에 100을 더하는 메서드를 작성하고, main에서 배열의 변화 여부를 출력하는 프로그램을 작성
public class Q2 {
    // TODO: addHundred 메서드 작성 (int[] arr의 첫 요소에 100을 더함)
    public static void addHundred(int[] arr) {
        arr[0] = arr[0] + 100;    // int[] arr의 첫 요소에 100을 더함
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
        for (int i : arr) {     // 향상된 for문
            System.out.print(i + " ");  // 출력하여 결과를 확인함
        }
        sc.close(); // 스캐너 닫기
    }
}