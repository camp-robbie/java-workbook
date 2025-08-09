package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // TODO: 1~n까지의 소수를 찾아 출력

        /*
        // solution
        boolean first = true;   // 첫 번째 소수인지 확인용 (공백 출력 제어)

        // 2부터 n까지 확인 (1은 소수가 아님)
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true; // 현재 수가 소수인지 판단

            // 2부터 i - 1까지 나누어 떨어지는지 확인
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false; // 약수가 있으므로 소수가 아님
                    break;
                }
            }

            // 소수인 경우 출력
            if (isPrime) {
                if (!first) {
                    System.out.print(" ");
                }
                System.out.print(i);
                first = false;
            }
        }

        System.out.println();   // 출력 이후 명령어가 새로운 줄에서 시작함으로써 가독성 향상하기 위한 용도
        sc.close();
    }
    */

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