package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();

        // TODO: d를 int로 강제 형변환하여 차이를 계산 후 출력

        int i = (int) d;  // d를 int로 강제 형변환

        double result = d - i; // 차이 계산

        // 출력
//        System.out.println("d = " + d);
//        System.out.println("i = " + i);
        System.out.printf("%.2f\n", result);
    }
}