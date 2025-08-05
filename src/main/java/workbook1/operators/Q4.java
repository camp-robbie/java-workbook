package main.java.workbook1.operators;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // TODO: b가 a보다 크고 c보다 작은지 평가하여 출력
        boolean result = b > a && b < c;    // &&을 사용하여 두 조건이 모두 만족될 경우에만 true를 반환하는 변수

        System.out.println(result);         // 결과를 확인하기 위해 출력함
    }
}