package main.java.workbook2.array;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        int[][] C = new int[3][3];
        // TODO: A, B에 값 저장 후 C = A + B 계산, C 출력

        // A에 값 저장
        for (int i = 0; i < A.length; i++) {          // 행 개수만큼 저장
            for (int j = 0; j < A[i].length; j++) {   // 해당 행의 열 개수만큼 저장
                A[i][j] = sc.nextInt();               // 정수 입력받아 A에 저장
            }
        }

        // B에 값 저장
        for (int i = 0; i < B.length; i++) {          // 행 개수만큼 저장
            for (int j = 0; j < B[i].length; j++) {   // 해당 행의 열 개수만큼 저장
                B[i][j] = sc.nextInt();               // 정수 입력받아 B에 저장
            }
        }

        // C 계산
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                C[i][j] = A[i][j] + B[i][j];          // C = A + B 계산
            }
        }
        // C 출력
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {   // C 요소 출력
                System.out.print(C[i][j] + " ");
            }
            System.out.println();                     // 한 행 종료시 개행
        }
        // 입력닫기
        sc.close();
    }
}
