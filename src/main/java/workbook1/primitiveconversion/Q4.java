package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float f1 = sc.nextFloat();
        float f2 = sc.nextFloat();
        // TODO: f1을 int로 강제 변환, f2를 double로 자동 변환해 합산 후 출력

        int i = (int) f1; // f1을 int로 강제 변환
        double d = f2; // f2를 double로 자동 형변환

        double result = d + i; // 합산


//        System.out.println("i = " + i);
//        System.out.println("d = " + d);
        System.out.printf("%.1f\n", result); // 출력
    }
}