package main.java.workbook1.loops;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        // TODO: 홀수 합과 짝수 합 계산 후 출력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int y = 0;
        for(int i = 1; i <= n; i++){
            x = x + i++; // 2씩 증가
        }
        for(int i = 0; i <= n; i++){
            y = y + i++; // 2씩 증가
        }
        System.out.println(x + " " + y);
    }
}
