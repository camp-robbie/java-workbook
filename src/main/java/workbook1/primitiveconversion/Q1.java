package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 자동 형변환: int → double
        double sum = a + b;  // a와 b가 double로 자동 형변환되어 덧셈 수행

        // 강제 형변환: double → int
        int result = (int) sum;

        System.out.println(result);

        sc.close();
    }
}