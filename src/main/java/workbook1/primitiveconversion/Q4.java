package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        // TODO: f1을 int로 강제 변환, f2를 double로 자동 변환해 합산 후 출력

        Scanner sc = new Scanner(System.in);

        // float 숫자를 입력 받는다.
        System.out.print("float 1: ");
        float f1 = sc.nextFloat();
        System.out.print("float 2: ");
        float f2 = sc.nextFloat();

        // f1을 int로 강제 변환, f2를 double로 자동 변환
        int float1 = (int) f1;
        double float2 = f2;

        // 합산 후 출력
        double sum = float1 + float2;
        System.out.println("sum = " + sum);


    }
}