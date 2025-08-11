package main.java.workbook2.array;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        // TODO: 스네이크 패턴으로 arr 채우고 출력

        //채워 넣을 숫자 num 변수 선언
        int num = 1;
        //rows만큼 행 생성
        for (int i = 0; i < rows; i++) {
            //만약 홀수 행 일 경우
            if ((i + 1) % 2 != 0) {
                //순서대로 채우기
                for (int j = 0; j < cols; j++) {
                    arr[i][j] = num++;
                }
            } else {//짝수 행일 경우 역순으로 채우기
                for (int j = cols - 1; j >= 0; j--) {
                    arr[i][j] = num++;
                }
            }
        }
        //행렬 출력
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}