package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 스캐너 생성
        System.out.print("f1: ");
        float f1 = sc.nextFloat();
        System.out.print("f2: ");
        float f2 = sc.nextFloat();
        // TODO: f1을 int로 강제 변환, f2를 double로 자동 변환해 합산 후 출력

        // int로 강제 변환
        int intNumber = (int) f1;
        double doubleNumber = f2;

        // 합산 후 출력
        double result = intNumber + doubleNumber;
        System.out.println("result = " + result);

        sc.close();
    }
}