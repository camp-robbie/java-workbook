package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // TODO: a와 b를 double로 자동 형변환하여 더한 뒤 int로 강제 변환하여 출력
        // 1. 단계별
        // a와 b를 double로 자동 형변환 및 더하기
        double sum = a + b;
        // int로 강제 변환
        int result = (int) sum;
        // 2. 한번에
        // int result = (int) ((double) a + (double) b);
        // 출력
        System.out.println(result);
    }
}