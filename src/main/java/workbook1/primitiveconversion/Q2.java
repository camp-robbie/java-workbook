package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        // TODO: d를 int로 강제 형변환하여 차이를 계산 후 출력
        int iD = (int) d; // int로 강제 형변환
        double sub = d - iD; // double d 와 int iD 차이 계산

        // System.out.println(sub) 출력 시 출력 예시처럼 출력안됨
        System.out.printf("%.2f", sub); // 출력(소숫점 둘째자리까지)
    }
}