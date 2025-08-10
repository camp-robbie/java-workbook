package main.java.workbook2.array;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        // TODO: 스네이크 패턴으로 arr 채우고 출력

        int num = 1;    // 채울 숫자 초기화

        // 스네이크 패턴으로 채우기
        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {   // 짝수 행: 왼쪽 -> 오른쪽 ex) 0번째 행: 1 2 3 4
                for (int j = 0; j < cols; j++) {
                    arr[i][j] = num++;
                }
            } else {
                for (int j = cols - 1; j >= 0; j--) {   // 홀수 행: 오른쪽 -> 왼쪽
                    arr[i][j] = num++;
                }
            }
        }

        // 출력
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + "\t");
            }

            System.out.println();
        }

        System.out.println();

        sc.close();
    }
}