package main.java.workbook1.operators;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        // TODO: x &gt; y 결과와 !(x &gt; y) 결과 출력
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        boolean b = x > y; // true 와 false로 출력하는 단순 구문

        String result = x == y ? "" : String.valueOf(b);
        // x 와 y 가 같을 때 조건 추가
        // 삼항연산자와 valueOf를 검색하여 적용

        System.out.println(result);
    }
}