package main.java.workbook1.operators;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // TODO: b가 a보다 크고 c보다 작은지 평가하여 출력

        boolean result1 = b > a ;
        boolean result2 = b < c;

        // 두 가지 전제 모두가 맞는지 판단 후 출력(두 조건이 모두 참이여야 true)
        result = result1 && result2;

        System.out.println("결과 =" + result);

    }
}