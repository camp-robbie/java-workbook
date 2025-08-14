package main.java.workbook2.array;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        // TODO: 스네이크 패턴으로 arr 채우고 출력

        int num = 1;
        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                // 왼쪽 → 오른쪽
                for (int j = 0; j < cols; j++) {
                    arr[i][j] = num++;
                }
            } else {
                // 오른쪽 → 왼쪽
                for (int j = cols - 1; j >= 0; j--) {
                    arr[i][j] = num++;
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + (j < cols - 1 ? " " : ""));
            }
            System.out.println();
        }
    }
}