package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // TODO: 1~n까지의 소수를 찾아 출력

        for (int i = 2; i <= n; i++) {  // 0과 1은 소수 X
            boolean prime = true;   // 소수라고 가정

            int squrt = (int) Math.sqrt(i);
            for (int j = 2; j <= squrt; j++) {  // j <= squrt 대신 j < i도 가능하지만, 비효율적
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime)
                System.out.print(i + " ");
        }

        sc.close();

    }
}