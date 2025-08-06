package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float f1 = sc.nextFloat();
        float f2 = sc.nextFloat();
        // TODO: f1을 int로 강제 변환, f2를 double로 자동 변환해 합산 후 출력
        int intValue = (int) f1;
        double doubleValue = f2;
        double result = intValue + doubleValue;
        System.out.println(result);
        sc.close();
    }
}