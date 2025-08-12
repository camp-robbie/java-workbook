package main.java.solutions.workbook2.array;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // n개의 정수를 배열에 저장
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 배열을 역순으로 출력
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i > 0) {  // 첫 번째 요소(역순에서 마지막)가 아니면 공백 추가
                System.out.print(" ");
            }
        }

        sc.close();

    }
}

/**
 * **코드 설명:**
 * 1. **입력 부분**:
 *     - `int n = sc.nextInt()`로 배열 크기 N 입력받기
 *     - `int[] arr = new int[n]`으로 크기 N의 정수형 배열 선언
 *     - `for (int i = 0; i < n; i++)` 반복문으로 N개의 정수를 순서대로 배열에 저장
 *
 * 2. **역순 출력**:
 *     - `for (int i = n - 1; i >= 0; i--)` 반복문으로 마지막 인덱스부터 첫 번째 인덱스까지 역순으로 접근
 *     - `System.out.print(arr[i])`로 각 요소 출력
 *     - `if (i > 0)` 조건으로 첫 번째 요소(역순에서 마지막)가 아닐 때만 공백 추가
 */