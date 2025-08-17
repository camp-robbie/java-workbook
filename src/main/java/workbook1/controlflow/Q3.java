package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        // TODO: 1~n까지의 소수를 찾아 출력

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i + " ");
            }
        }

        // 결국 못풀어서 답지를 봤습니다.
        // 하지만 답지를 봐도 코드가 해석이 되지 않습니다
        // 디버깅 모드를 돌려봐도 이해가 되지 않습니다,,,

    }
}