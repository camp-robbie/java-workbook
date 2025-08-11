package main.java.workbook1.operators;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        // TODO: x > y 결과와 !(x > y) 결과 출력

        Scanner sc = new Scanner(System.in);

        // 스캐너를 통해 두 개의 실수를 입력 받는다.
        System.out.print("Num1: ");
        double x = sc.nextDouble();
        System.out.print("Num2: ");
        double y = sc.nextDouble();

        // 논리 연산자를 사용한다.
        boolean biggerX = x > y;                       // x가 크면 true다
        System.out.println("biggerX = " + biggerX);

        boolean smallerX = !(x > y);                   // x가 작으면 true다
        System.out.println("smallerX = " + smallerX);

    }
}