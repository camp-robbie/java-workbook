package main.java.workbook1.loops;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // TODO: do-while 문으로 3의 배수의 합 계산 후 출력

        // 반복문 내 반복 변수의 증가 간격 활용
        int sum = 0;
        int i = 3;

        /**
         * 3의 배수가 없는 n = 1 , n = 2의 경우
         * 종결 조건 확인 전 최소 한 번은 실행되는 do-while 특성으로
         * n = 1 -> 3 잘못된 결과 출력
         * n = 2 -> 3 잘못된 결과 출력
         * 따라서 조건문 사용
         */
        if (n < 3) {
            System.out.println(0);
        } else {
            do {
                sum += i;
                i += 3;
            } while (i <= n);

            System.out.println(sum);
        }

        /*
        // solution
        do {
            if (i <= n) {
                sum += i;
            }
            i += 3;
        } while (i <= n);

        System.out.println(sum);
        */

        // 반복문 내 if 문 활용
//        int sum = 0;
//        int i = 1;
//        do {
//            if (i % 3 == 0) {
//                sum += i;
//            }
//            i++;
//        } while (i <= n);
//
//        System.out.println(sum);

        sc.close();
    }
}
