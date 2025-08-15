package main.java.workbook2.paramtypes;

import java.util.Scanner;

public class Q2 {       // 참조형(배열) 매개변수
    // TODO: addHundred 메서드 작성 (int[] arr의 첫 요소에 100을 더함)

    /**
     * 참조형(배열, 객체)은 '객체의 주소(참조값)'이 복사되어 전달됩니다.
     * 같은 배열을 가리키므로, 요소 변경이 호출한 곳에도 반영됩니다.
     */

    public static void addHundred(int[] arr) {
        // 안전 처리: 비어있지 않다면 첫 요소에 100 더하기
        if (arr != null && arr.length > 0) {
            arr[0] += 100; // 같은 배열의 첫 요소를 직접 수정
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();       // 입력 예: 3
        int[] arr = new int[n];     // 이후 입력: 1 2 3

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        addHundred(arr); // TODO: addHundred 메서드 작성 후 주석 해제
        // TODO: 변경된 arr 출력

        // 출력: "101 2 3"
        for (int i = 0; i < n; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(arr[i]);
        }
        System.out.println();

        sc.close();
    }
}