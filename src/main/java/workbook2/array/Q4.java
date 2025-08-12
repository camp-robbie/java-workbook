package main.java.workbook2.array;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        int[][] C = new int[3][3];
        // TODO: A, B에 값 저장 후 C = A + B 계산, C 출력

        // A의 값을 입력밭는 반복문입니다.
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                // System.out.println("["+i+"]["+j+"]");
                A[i][j] = sc.nextInt();
            }
        }
        // B의 값을 입력받는 반복문입니다.
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                // System.out.println("["+i+"]["+j+"]");
                B[i][j] = sc.nextInt();
            }
        }
        // 행렬을 더하는 반복문입니다.
        // 해당 배열들은 정사각형의 모양을 하고 있으므로, A.length 이상의 크기가 나올 수 없습니다.
        // 만약 B가 3*3 이상의 크기를 가지고 있거나, 정사각형이 아닐 때
        // 필터링 해주기 위하여 이렇게 사용합니다.
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        // 출력합니다.
        for (int[] ints : C) {
            for (int j = 0; j < C.length; j++) {
                System.out.print(ints[j] + " ");
            }
            // 개행합니다.
            System.out.println();
        }
    }
}
