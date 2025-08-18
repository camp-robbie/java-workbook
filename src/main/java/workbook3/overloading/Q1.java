package main.java.workbook3.overloading;

import java.util.Scanner;

public class Q1 {
    // TODO: printValue 오버로딩 (int), (double), (String)
    //printValue 메서드를 정수, 실수, 문자열 세 가지 매개변수 타입에 대해 오버로딩하여 각각 값을 출력하는 프로그램을 작성하시오.

    static void printValue(int x) {
        System.out.println(x);
    }

    static void printValue(double x) {
        System.out.println(x);
    }

    static void printValue(String x) {
        System.out.println(x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        double d = sc.nextDouble();
        String s = sc.next();
        // TODO: printValue (int), (double), (String) 메서드 작성 후 아래 주석 해제
         printValue(i);
         printValue(d);
         printValue(s);
    }
}
