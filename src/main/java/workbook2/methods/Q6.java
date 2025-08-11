package main.java.workbook2.methods;

import java.math.BigInteger;
import java.util.Scanner;

public class Q6 {
    // TODO: 재귀를 이용한 factorial 메서드 작성
    // long 이하 시
//    public long factorial(int n) {
//        long result = 1;   // 명시적: 1L 또는 (long) 1 -> 곱셈 연산 시 오버플로우 방지
//        for (int i = 2; i <= n; i++) {
//            result *= i;
//        }
//        return result;
//    }

    // long 초과 시: BigInteger 함수 활용
    public BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // TODO: factorial 호출 후 결과 출력

        Q6 q6 = new Q6();

        System.out.println(q6.factorial(n));

        sc.close();

    }
}
