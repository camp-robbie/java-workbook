package main.java.workbook2.array;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        int[][] C = new int[3][3];

        // TODO: A, B에 값 저장 후 C = A + B 계산, C 출력

        for(int i = 0; i < A.length; i++) {     // i는 0이고, i가 A.length보다 작을 때까지 1씩 증가시키며 반복함
                for(int j = 0; j < A[i].length; j++) {  // j는 0이고, j가 A[i].length보다 작을 때까지 1씩 증가시키며 반복함
                A[i][j] = sc.nextInt();         // A[i][j]에 숫자를 입력받음
            }
        }

        for(int i = 0; i < B.length; i++) {      // i는 0이고, i가 B.length보다 작을 때까지 1씩 증가시키며 반복함
            for(int j = 0; j < B[i].length; j++) {      // j는 0이고, j가 B[i].length보다 작을 때까지 1씩 증가시키며 반복함
                B[i][j] = sc.nextInt();         // B[i][j]에 숫자를 입력받음
            }
        }

        for(int i = 0; i < C.length; i++) {      // i는 0이고, i가 C.length보다 작을 때까지 1씩 증가시키며 반복함
            for(int j = 0; j < C[i].length; j++) {      // j는 0이고, j가 C[i].length보다 작을 때까지 1씩 증가시키며 반복함
                C[i][j] = A[i][j] + B[i][j];    // C[i][j]에 숫자를 입력받음
            }
        }

        for(int i = 0; i < C.length; i++) {     // i는 0이고, i가 C.length보다 작을 때까지 1씩 증가시키며 반복함
            for(int j = 0; j < C[i].length; j++) {      // j는 0이고, j가 C[i].length보다 작을 때까지 1씩 증가시키며 반복함
                System.out.print(C[i][j] + " ");        // 결과를 출력함
            }
            System.out.println();                       // 줄바꿈
        }
    }
}
