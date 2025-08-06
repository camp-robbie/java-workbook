package main.java.workbook1.operators;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        a += (b * c); // a에 b*c의 값을 더하면서 저장한다.
        System.out.println(a + " " + b + " " + c);
        sc.close(); // 자원 누수 방지
    }
}
