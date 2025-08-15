package main.java.workbook3.overloading;

import java.util.Scanner;

public class Q6 {
    // TODO: multiply 오버로딩 (int[]), (int[][], int[][])
    static int multiply(int[] arr){
        int a = 1 ;
        for(int i = 0; i<arr.length; i++){
            a *= arr[i];
        }
        return a;
    }

    static int[][] multiply(int[][] m1, int[][] m2){
        int[][] a = new int[2][2];
        for (int i = 0; i < 2; i++) {               //행렬 m1 값 입력하기
            for (int j = 0; j < 2; j++) {
                a[i][j] = m1[i][0]*m2[0][j] + m1[i][1]*m2[1][j];        //행렬 곱셈 계산
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();
        if (type == 2) {                            //2입력 -> 배열 / 3입력 -> 행렬
            int n = sc.nextInt();                   //배열의 길이 입력
            int[] arr = new int[n];                 //배열 선언
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            System.out.println(multiply(arr)); // TODO: multiply(int[]) 메서드 작성 후 주석 해제
        } else {                                    //행렬
            int[][] m1 = new int[2][2];
            int[][] m2 = new int[2][2];
            for (int i = 0; i < 2; i++) {               //행렬 m1 값 입력하기
                for (int j = 0; j < 2; j++) {
                    m1[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < 2; i++) {               //행렬 m2값 입력하기
                for (int j = 0; j < 2; j++) {
                    m2[i][j] = sc.nextInt();
                }
            }
            // TODO: multiply(int[][], int[][]) 메서드 작성 후 주석 해제 아래 주석 해제
            int[][] result = multiply(m1, m2);
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                   System.out.print(result[i][j] + (j==1?"":" "));
                }
                System.out.println();
            }
        }
    }
}