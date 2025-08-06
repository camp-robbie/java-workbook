package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        // TODO: d를 int로 강제 형변환하여 차이를 계산 후 출력
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();

        int a = (int) d;
        // 강제 형변환 (소수점 자리 삭제)

        double sub = d - (double) a;
        // 계산을 위해 int를 또 강제 형변환 하여 뺄셈 계산

        System.out.println(Math.floor(sub*100)/100);
        // 소수점 자리가 원하는대로 출력되지 않아서 따로 처리
    }
}