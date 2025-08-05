package main.java.workbook1.operators;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        // TODO: x > y 결과와 !(x > y) 결과
        boolean b = x>y;
        boolean d = !(x>y);
        //출력
        System.out.println(b + " " + d);
    }
}