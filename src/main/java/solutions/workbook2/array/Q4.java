package main.java.solutions.workbook2.array;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        int[][] C = new int[3][3];

        // 첫 번째 행렬 A 입력받기
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // 두 번째 행렬 B 입력받기
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // 행렬 덧셈 수행: C = A + B
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        // 결과 행렬 C 출력
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(C[i][j]);
                if (j < 2) {  // 같은 행에서 마지막 요소가 아니면 공백 추가
                    System.out.print(" ");
                }
            }
            System.out.println();  // 한 행이 끝나면 줄바꿈
        }

        sc.close();

    }
}

/**
 * **코드 설명:**
 * 1. **첫 번째 행렬 A 입력**:
 *     - 중첩 반복문으로 3x3 행렬의 모든 요소를 행별로 입력받기
 *     - `A[i][j] = sc.nextInt()`로 각 위치에 값 저장
 *
 * 2. **두 번째 행렬 B 입력**:
 *     - 동일한 방식으로 두 번째 행렬 B의 모든 요소 입력받기
 *
 * 3. **행렬 덧셈 수행**:
 *     - `C[i][j] = A[i][j] + B[i][j]`로 같은 위치의 요소들을 더해서 결과 행렬 C에 저장
 *
 * 4. **결과 출력**:
 *     - 중첩 반복문으로 결과 행렬 C를 행별로 출력
 *     - 같은 행에서는 공백으로 구분하고, 행이 끝나면 줄바꿈
 */