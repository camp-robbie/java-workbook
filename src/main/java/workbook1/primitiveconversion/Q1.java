package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        //자동 형변환 (int -> double)
        double result = a+b;

        //강제 형변환(double -> int)
        System.out.println((int)result);
    }
}