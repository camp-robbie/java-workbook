package main.java.workbook2.array;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        int[][] C = new int[3][3];

        // TODO: A, B에 값 저장 후 C = A + B 계산, C 출력
        // 2차원 배열을 이용하여 3x3 행렬의 두 개를 입력받아 행렬 덧셈을 수행하고, 결과 행렬을 출력하는 프로그램을 작성하시오.
        // 2차원 배열 두 개를 선언하여 각 요소를 더합니다.

        // 2차원 배열을 이용하여 3x3 행렬 A 입력
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // 2차원 배열을 이용하여 3x3 행렬 B 입력
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

        // 결과 행렬 출력
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println(" "); // 줄바꿈을 해주지 않으면 결과가 한줄로 나옴
        }
        sc.close();
    }
}

// System.out.println(A); -> 배열의 내용 출력하는 것이 아닌 배열의 참초값(메모리 주소)만 보여줌
//   for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                A[i][j] = sc.nextInt();
//            }
//            System.out.println(A);
//       }