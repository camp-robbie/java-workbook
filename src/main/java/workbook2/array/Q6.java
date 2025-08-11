package main.java.workbook2.array;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: 스네이크 패턴으로 arr 채우고 출력

        System.out.println("행(Row)과 열(Col)을 입력해주세요: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];
        int num = 1;

        for (int i = 0; i < rows; i++) {             // i: 현재 행 번호
            if (i % 2 == 0) {                       // 행 번호가 짝수면 → 왼쪽에서 오른쪽으로
                for (int j = 0; j < cols; j++) {
                    arr[i][j] = num++;              // 열 인덱스 증가 방향
                }
            } else {                                // 행 번호가 홀수면 → 오른쪽에서 왼쪽으로
                for (int j = cols - 1; j >= 0; j--) {
                    arr[i][j] = num++;              // 열 인덱스 감소 방향
                }
            }
        }

        /* 헷갈려서 정리..
         * i % 2 == 0
         *  // i가 짝수(0, 2, 4, …) → “왼쪽→오른쪽” 순서로 열(j)을 증가시킴
         *  // 내부 for문: for (j = 0; j < cols; j++) -> 열 인덱스가 0부터 끝까지 올라감

         * else (i가 홀수)
         *  // i가 홀수(1, 3, 5, …) → “오른쪽→왼쪽” 순서로 열(j)을 감소시킴
         *  // 내부 for문: for (j = cols - 1; j >= 0; j--)  ->  열 인덱스가 마지막부터 0까지 내려감

         * num++ : 1부터 시작해서 매 칸마다 1씩 증가시켜서 번호 채움
         */

        // 배열 출력
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}