package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // TODO: 1~n까지의 소수를 찾아 출력
        //정수 N을 입력받아 1부터 N까지의 수 중 소수(prime number)를 찾아 모두 출력하는 프로그램을 작성하시오.
        // 반복문 안에서 또 다른 반복문을 사용하여 소수 여부를 판단합니다.
        // 소수는 1과 자신만을 약수로 갖는 수입니다.

        for (int i = 2; i <= n; i++) { // 1은 소수 아님
            boolean isPrime = true; // 소수라고 가정

            for (int j = 2; j < i; j++) {
                if (i % j == 0) { // 나머지가 0이 되면
                    isPrime = false; // 소수 아님
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " "); // 소수(prime number)를 찾아 모두 출력
            }
        }
    }
}