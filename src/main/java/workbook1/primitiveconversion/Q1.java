package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // TODO: a와 b를 double로 자동 형변환하여 더한 뒤 int로 강제 변환하여 출력

        // 예? 뭐 하란 거지

        double sumDouble = (double) a + (double) b;
        int sumInt = (int) sumDouble;
        System.out.println(sumInt);

    }
}