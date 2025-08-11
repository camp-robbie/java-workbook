package main.java.workbook1.operators;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        // TODO: a += b * c 연산 후 a, b, c 출력

        Scanner sc = new Scanner(System.in);

        // 스캐너를 통해 숫자를 입력 받는다.
        System.out.print("a: ");
        int a = sc.nextInt();
        System.out.print("b: ");
        int b = sc.nextInt();
        System.out.print("c: ");
        int c = sc.nextInt();

        // a += b * c 연산값을 저장하는 변수를 만든다.
        int sum = a += b * c;  // sum = a + (b * c)
        System.out.println("sum = " + sum);

    }
}
