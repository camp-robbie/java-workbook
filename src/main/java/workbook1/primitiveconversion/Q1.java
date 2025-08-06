package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // TODO: a와 b를 double로 자동 형변환하여 더한 뒤 int로 강제 변환하여 출력
        double sum = a + b; // a와 b double로 자동 형변환하여 더하기 수행

        int result = (int) sum; // int로 강제 형변환

        // 출력
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//        System.out.println("sum = " + sum);
        System.out.println(result);
    }
}