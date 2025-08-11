package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // TODO: a와 b를 double로 자동 형변환하여 더한 뒤 int로 강제 변환하여 출력
        // double dA = a; -> a 자동 형변환
        // double dB = b; -> b 자동 형변환

        double sum = a + b; // a, b 연산 중 자동 형 변환
        int iSum = (int)sum; // double -> int 강제 형 변환

        System.out.println(iSum); // 출력
    }
}