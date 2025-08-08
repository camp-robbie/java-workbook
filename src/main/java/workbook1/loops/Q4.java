package main.java.workbook1.loops;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        // TODO: 이중 for 문으로 별 패턴 출력

        //m번 반복하여 m개의 행 생성
        for (int i = 0; i < m; i++) {
            //j번 반복하여 한 행에 j개의 별 생성
            for (int j = 0; j < n; j++) {
                System.out.print("*");//별 찍는 식
            }
            //줄바꿈
            System.out.println();
        }
        sc.close();
    }
}
