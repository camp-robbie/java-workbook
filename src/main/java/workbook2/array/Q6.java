package main.java.workbook2.array;

import java.util.Scanner;

/**
 * Q6: rows, cols를 입력받아 1부터 rows*cols까지 숫자를 "스네이크 패턴"으로 채워 출력.
 * - 짝수(0, 2, 4...)번째 행: 왼→오 (정방향)
 * - 홀수(1, 3, 5...)번째 행: 오→왼 (역방향)
 * 예) 3 4
 *  1  2  3  4
 *  8  7  6  5
 *  9 10 11 12
 */

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];
        // TODO: 스네이크 패턴으로 arr 채우고 출력

        int num = 1; // 채워 넣을 숫자(1부터 시작)

        for (int r = 0; r < rows; r++) {
            if (r % 2 == 0) {
                // 짝수 행: 왼쪽 → 오른쪽
                for (int c = 0; c < cols; c++) {
                    arr[r][c] = num++;
                }
            } else {
                // 홀수 행: 오른쪽 → 왼쪽
                for (int c = cols - 1; c >= 0; c--) {
                    arr[r][c] = num++;
                }
            }
        }

        // 출력 (각 행 한 줄, 공백 구분)
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (c > 0) System.out.print(" ");
                System.out.print(arr[r][c]);
            }
            System.out.println();
        }
    }
}