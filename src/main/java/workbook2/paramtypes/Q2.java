package main.java.workbook2.paramtypes;

import java.util.Scanner;

public class Q2 {
    // TODO: addHundred 메서드 작성 (int[] arr의 첫 요소에 100을 더함)

    public static void addHundred(int[] arr){
        arr[0] += 100; // 배열 첫 요소에 100 더하기
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        addHundred(arr);
        for (int num : arr) {
            System.out.println(num + " ");
        }
    }
}
/**
 - 배열은 참조형(reference) → 메서드에서 변경하면 main에서도 그대로 반영
 - addHundred 메서드는 첫 번째 요소만 변경하는 단순 처리
 - for-each 문으로 배열 전체 출력
 */