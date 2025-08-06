package main.java.workbook1.operators;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        // TODO: x &gt; y 결과와 !(x &gt; y) 결과 출력\
        // &gt; : >, greater than (크다)
        // x > y 결과, !(x > y)결과 출력

        System.out.println(x > y);
        System.out.println(!(x > y));
    }
}