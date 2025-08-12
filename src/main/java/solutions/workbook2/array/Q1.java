package main.java.solutions.workbook2.array;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        // 5개의 정수를 배열에 저장
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        // 배열의 모든 요소를 공백으로 구분하여 출력
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i]);
            if (i < 4) {  // 마지막 요소가 아니면 공백 추가
                System.out.print(" ");
            }
        }

        sc.close();

    }
}

/**
 * **코드 설명:**
 * 1. **입력 부분**:
 *     - `for (int i = 0; i < 5; i++)` 반복문으로 5번 반복
 *     - `arr[i] = sc.nextInt()`로 각 인덱스에 정수 저장
 *
 * 2. **출력 부분**:
 *     - 다시 `for` 반복문으로 배열의 모든 요소 출력
 *     - `System.out.print(arr[i])`로 요소 출력
 *     - `if (i < 4)` 조건으로 마지막 요소가 아닐 때만 공백 추가
 *
 * 이렇게 하면 `1 2 3 4 5`를 입력했을 때 동일하게 `1 2 3 4 5`가 출력됩니다.
 */