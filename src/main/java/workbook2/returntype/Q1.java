package main.java.workbook2.returntype;

import java.util.Scanner;

public class Q1 {
    // TODO: add 메서드 작성
    // 메서드 반환 타입은 int
    public static int add(int a, int b) {       // add 메서드 (매개변수: int a, int b / 반환 타입: int)
        return a + b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // TODO: add 호출 후 결과 출력
        System.out.println(add(a, b));
    }
}