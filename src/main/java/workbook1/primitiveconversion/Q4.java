package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        // TODO: f1을 int로 강제 변환, f2를 double로 자동 변환해 합산 후 출력
        Scanner sc = new Scanner(System.in);
        float f1 = sc.nextFloat();
        float f2 = sc.nextFloat();

        double sum = (double) ((int) f1) + (double) f2;
        // 두 번의 강제 형변환을 하나로 결합

        System.out.println(Math.floor(sum*100)/100);
        // 소수점 자리가 원하는대로 출력되지 않아서 따로 처리
    }
}