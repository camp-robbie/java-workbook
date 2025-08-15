package main.java.workbook2.array;

import java.util.Scanner;

/**
 * Q4: 3x3 정수 행렬 두 개(A, B)를 입력받아 같은 위치끼리 더한 C=A+B를 출력합니다.
 * - 입력 순서: A의 9개 → B의 9개 (줄바꿈은 상관없고, 공백/개행 단위로 차례대로 읽음)
 * - 출력: 3줄, 각 줄에 3개 숫자 공백 구분
 */

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        int[][] C = new int[3][3];
        // TODO: A, B에 값 저장 후 C = A + B 계산, C 출력

        // A 입력
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // B 입력
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // C = A + B 계산
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        // 출력
        for (int i = 0; i < 3; i++) {
            System.out.println(C[i][0] + " " + C[i][1] + " " + C[i][2]);
        }
    }
}
