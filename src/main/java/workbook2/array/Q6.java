package main.java.workbook2.array;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        // TODO: 스네이크 패턴으로 arr 채우고 출력
        // 행이 홀수번째일 때와 짝수번째일 때 출력 순서를 달리함
        int num = 1;    // 숫자 변수
        for(int i = 0; i < rows; i++) { // 행을 반복하는 동안
            if(i % 2 == 0) {            // 짝수 행이면
                for(int j = 0; j < cols; j++) { // 열을 반복하는 동안
                    arr[i][j] = num++;          // arr[i][j]에 num을 저장하고, num의 숫자를 증가시킴
                }
            }
            else {                      // 그렇지 않으면
                for(int j = cols - 1; j >= 0; j--) {    // 열은 cols - 1부터 0까지 1씩 감소시키며 반복함 (뒤에서부터 채워주는 작업)
                    arr[i][j] = num++;                  // arr[i][j]에 num을 저장하고, num의 숫자를 증가시킴
                }
            }
        }

        for(int i = 0; i < rows; i++) {     // 행을 반복하는 동안
            for(int j = 0; j < cols; j++) { // 열을 반복하는 동안
                System.out.print(arr[i][j] + " ");  // 출력함
            }
            System.out.println();   // 줄바꿈
        }
    }
}