package main.java.workbook3.overloading;

import java.util.Scanner;

// `multiply` 메서드를 오버로딩하여 정수 배열을 받아 모든 요소의 곱을 구하는 버전, 두 개의 행렬을 받아 행렬 곱셈을 수행하는 버전을 작성
public class Q6 {
    // TODO: multiply 오버로딩 (int[]), (int[][], int[][])
    public static int multiply(int[] arr) {
        int result = 1;

        for(int i = 0; i < arr.length; i++) {
             result *= arr[i];
        }

        return result;
    }

//    public static int multiply(int[] m1, int[] m2) {
//        int[][] result = new int[m1.length][m1.length];
//
//        for(int i = 0; m1.length; i++) {
//            for(int j = 0; m1.length; j++) {
//                result[i][j] = 0;
//            }
//        }
//    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();
        if (type == 2) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
             System.out.println(multiply(arr));
        } else {
            int[][] m1 = new int[2][2];
            int[][] m2 = new int[2][2];
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    m1[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    m2[i][j] = sc.nextInt();
                }
                // TODO: multiply(int[][], int[][]) 메서드 작성 후 주석 해제 아래 주석 해제
                // int[][] result = multiply(m1, m2);
            }
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                   // System.out.print(result[i][j] + (j==1?"":" "));
                }
                System.out.println();
            }
        }
    }
}