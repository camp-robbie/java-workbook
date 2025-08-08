package main.java.workbook1.operators;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        boolean a = x > y;
        boolean b = !a;
        System.out.print(a + " " + b);
        // TODO: x &gt; y 결과와 !(x &gt; y) 결과 출력
    }
}