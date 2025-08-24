package main.java.workbook3.overloading;

import java.util.Scanner;

public class Q1 {
    // TODO: printValue 오버로딩 (int), (double), (String)
    // printValue 오버로딩 (int)
    public static void printValue(int i) {
        System.out.println(i);      // i를 출력함
    }

    // printValue 오버로딩 (double)
    public static void printValue(double d) {
        System.out.println(d);      // d를 출력함
    }

    // printValue 오버로딩 (String)
    public static void printValue(String s) {
        System.out.println(s);      // s를 출력함
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 스캐너 열기

        int i = sc.nextInt();                   // int형 i의 값을 사용자로부터 입력받음
        double d = sc.nextDouble();             // double형 d의 값을 사용자로부터 입력받음
        String s = sc.next();                   // String형 s의 값을 사용자로부터 입력받음

        // TODO: printValue (int), (double), (String) 메서드 작성 후 아래 주석 해제
         printValue(i);                         // printValue (int) 메서드를 실행함
         printValue(d);                         // printValue (double) 메서드를 실행함
         printValue(s);                         // printValue (String) 메서드를 실행함
    }
}
