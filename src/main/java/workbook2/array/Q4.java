package main.java.workbook2.array;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            int[][] A = new int[3][3];
            int[][] B = new int[3][3];
            int[][] C = new int[3][3];
            // TODO: A, B에 값 저장 후 C = A + B 계산, C 출력

            for (int i = 0; i < 3; i++) { // A의 행
                for (int j = 0; j < 3; j++) { // A의 열
                    A[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < 3; i++) { // B의 행
                for (int j = 0; j < 3; j++) { // B의 열
                    B[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < 3; i++) { // C의 행
                for (int j = 0; j < 3; j++) { // C의 열
                    C[i][j] = A[i][j] + B[i][j]; // (A,B 각 행과 열) 숫자를 합한 결과를 C에 저장
                }
            }

            for (int i = 0; i < 3; i++) { // C의 행
                for (int j = 0; j < 3; j++) { // C의 열
                    System.out.print(C[i][j] + " "); // 출력 예시와 맞게 출력
                }
                System.out.println(); // 줄 변경
            }

        } catch(InputMismatchException e){
            System.out.println("숫자만 입력해주세요!");
        } finally {
            sc.close();
        }
    }
}
