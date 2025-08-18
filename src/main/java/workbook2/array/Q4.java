package main.java.workbook2.array;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[][] A 는 2차원 배열 선언,  new int[3][3] 은 3행 3열 크기의 정수형 배열을 생성한다는 의미
        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        int[][] C = new int[3][3];
        // TODO: A, B에 값 저장 후 C = A + B 계산, C 출력

        // A 입력
        System.out.println("Enter elements of matrix A (3x3):");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j <3; j++){
                A[i][j] = sc.nextInt();
            }
        }
        // B 입력
        System.out.println("Enter elements of matrix B (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        // 행렬 덧셈 계산
        System.out.println("Result matrix C = A + B:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        // 결과 행렬 C 출력
        for(int i = 0; i < 3; i++){
            for(int j = 0; j< 3; j++){
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

    }

}
