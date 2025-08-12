package main.java.solutions.workbook2.array;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // n개의 정수를 배열에 저장
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 버블 정렬 구현
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                // 인접한 두 요소를 비교하여 큰 값을 뒤로 이동
                if (arr[j] > arr[j + 1]) {
                    // 두 요소의 위치를 바꿈 (swap)
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // 정렬된 배열 출력
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) {  // 마지막 요소가 아니면 공백 추가
                System.out.print(" ");
            }
        }

        sc.close();

    }
}

/**
 * **버블 정렬 알고리즘 설명:**
 * 1. **입력 부분**:
 *     - N개의 정수를 배열에 저장
 *
 * 2. **버블 정렬 구현**:
 *     - **외부 반복문** `for (int i = 0; i < n - 1; i++)`: 총 n-1번의 패스를 수행
 *     - **내부 반복문** `for (int j = 0; j < n - 1 - i; j++)`: 각 패스에서 인접한 요소들을 비교
 *     - `n - 1 - i`인 이유: 각 패스가 끝날 때마다 가장 큰 요소가 맨 뒤로 정렬되므로 비교 범위가 줄어듦
 *     - **비교 및 교환**: `arr[j] > arr[j + 1]`이면 두 요소의 위치를 바꿈
 *
 * 3. **정렬 과정** (예시: `4 2 9 1 5`):
 *     - 1번째 패스: `2 4 1 5 9` (9가 맨 뒤로)
 *     - 2번째 패스: `2 1 4 5 9` (5가 올바른 위치로)
 *     - 3번째 패스: `1 2 4 5 9` (4가 올바른 위치로)
 *     - 4번째 패스: `1 2 4 5 9` (2가 올바른 위치로)
 *
 * 4. **출력**:
 *     - 정렬된 배열을 공백으로 구분하여 출력
 */