package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // TODO: 1~n까지의 소수를 찾아 출력

        // 첫 번째 시도 - 2, 5만 출력 되면서 실패
//        for(int i = 2; i < n; i++) {
//            if (n % i == 0) {
//                System.out.println(i);
//            }
//        }

        // 두 번째 시도 - 소수가 아닌 숫자들도 출력이 됨.
//        for(int i = 2; i < n; i++) {
//            if (n % i != 0) {
//                System.out.println(i);
//            }
//        }

        // 세 번째 시도 - 실패
//        for (int i = 2; i < n; i++) {
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0) {
//                    System.out.println(i + " ");
//                }
//            }
//        }

        // 네 번째 시도 - 지피티 도움 받아 작성, 하지만 코드 해석이 안 된다,,,
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j ==0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i + " ");
            }
        }

    }
}