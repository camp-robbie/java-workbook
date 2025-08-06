package main.java.workbook1.operators;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        // TODO: x > y 결과와 !(x > y) 결과 출력

        boolean result = x > y;
        boolean notResult = !result; // 괄호 안 x > y가 가장 먼저 연산됨

        System.out.println("result = " + result);
        System.out.println("notResult = " + notResult);

        // ==의 반대 !=

    }
}