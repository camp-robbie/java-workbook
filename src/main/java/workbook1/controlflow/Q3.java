package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // TODO: 1~n까지의 소수를 찾아 출력

        for (int i = 2; i < n; i++) {
            boolean isPrime = true;
            // 일단 isPrime 이 소수라고 가정.
            // 참, 거짓 두가직 종류로만 판단하기 때문에, boolean  사용

            for (int j = 0; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false; // 약수가 발견되며 소수가 아님
                    break;
                }
            }
            if (isPrime) {
                System.out.println( i + " ");
            }
        }
    }
}