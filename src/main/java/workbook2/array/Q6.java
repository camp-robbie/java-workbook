package main.java.workbook2.array;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt(); // 행
        int cols = sc.nextInt(); // 열
        int[][] arr = new int[rows][cols];

        // TODO: 스네이크 패턴으로 arr 채우고 출력
        // 문제 설명: 2차원 배열을 활용하여 아래와 같은 스네이크 패턴을 출력하는 프로그램을 작성하시오.
        // 행이 홀수번째일 때와 짝수번째일 때 출력 순서를 달리합니다.
        // 스네이크 패턴(Snake Pattern) : 2차원 배열에서 각 행을 번갈아가며 왼→오, 오→왼 방향으로 채우는 방식, 홀수 번째 행은 정방향, 짝수 번째 행은 역방향으로 채워짐.

        int num = 1;

        // 2차원 배열을 활용하여 스네이크 패턴으로 arr 채우고
        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                // 짝수 번째 행 : 왼->오
                for (int j = 0; j < cols; j++) {
                    arr[i][j] = num++;
                }
            }  else {
                // 짝수 번이 아니니까 홀수 번째 행 : 오->왼
                for (int j = cols - 1; j >= 0; j--) {
                    arr[i][j] = num++;
                }
            }
        }
        // 배열 출력
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}