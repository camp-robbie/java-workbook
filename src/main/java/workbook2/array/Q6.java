package main.java.workbook2.array;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        // TODO: 스네이크 패턴으로 arr 채우고 출력
        /* " 스테이크 패턴
            - 행이 홀수 =   왼쪽 -> 오른쪽 으로 채움
            - 행이 짝수 =  오른쪽 -> 왼쪽 으로 채움
         */

        // 1부터 순서대로 입력되는 num 변수 선언 및 초기화
        int num = 1;

        // 스네이크 패턴
        for (int r = 0; r < rows; r++) {            //
            if (r % 2 == 0) {                       // 행이 짝수라면
                for (int c = 0; c < cols; c++) {    // [왼쪽 -> 오른쪽] 으로 채움
                    arr[r][c] = num++;              // num 1씩 증가시켜주어 다음 숫자 자동 채우기
                }
            } else {
                for (int c = cols-1; c >= 0; c--) {  // 행이 홀수라면 [오른쪽 -> 왼쪽] 으로 채움
                    arr[r][c] = num++;               // num 1씩 증가시켜주어 다음 숫자 자동 채우기
                }
            }
        }

        // 배열 요소 출력
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                System.out.print(arr[r][c] + " ");
            }
            System.out.println();
        }
    }
}