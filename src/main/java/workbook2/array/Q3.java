package main.java.workbook2.array;

import java.util.Scanner;

/**
 * Q3: 먼저 정수 N을 입력받고, N개의 정수를 배열에 저장한 뒤 "역순"으로 출력합니다.
 * - 예: N=4, 입력: 1 2 3 4 → 출력: 4 3 2 1
 * - 핵심: 입력은 순서대로, 출력만 뒤에서 앞으로
 */

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 배열 길이
        int n = sc.nextInt();
        int[] arr = new int[n];
        // TODO: arr에 n개의 정수 저장 후 역순으로 출력

        // 입력: 앞에서부터 채우기
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 출력: 뒤에서 앞으로 출력(공백 처리에 주의)
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i > 0) System.out.print(" "); // 마지막 숫자 뒤에는 공백 X
        }
        System.out.println();
    }
}