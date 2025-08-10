package main.java.workbook2.array;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        int[][] C = new int[3][3];
        // TODO: A, B에 값 저장 후 C = A + B 계산, C 출력

        // 1. A 값 입력 받기
        // i = 행
        // j = 열
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // 2. B 값 입력 받기
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // 3. A + B = C 및 출력
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(C[i][j] + " ");
                // 한 번에
//                System.out.print(A[i][j] + B[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        sc.close();

    }
}
