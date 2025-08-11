package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        // TODO: a와 b를 double로 자동 형변환하여 더한 뒤 int로 강제 변환하여 출력

        Scanner sc = new Scanner(System.in);

        // a와 b를 입력 받는다.
        System.out.print("a: ");
        int a = sc.nextInt();
        System.out.print("b: ");
        int b = sc.nextInt();

        // 입력받은 숫자를 double로 자동 형변환한 뒤 더한다.
        double sum = (double) a + b;
        System.out.println("double sum: " + sum);

        // int로 강제 변환하여 출력
        int intSum = (int) sum;
        System.out.println("int sum = " + intSum);

    }
}