package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        // TODO: 1~n까지의 소수를 찾아 출력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 2; i <= n; i++) {
            int j;
            for (j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    break; // 나눠지는 수가 있으면 반복문을 빠져나감
                }
            }

            if (j * j > i) {
                System.out.print(i + " ");
            }
        }
    }
}