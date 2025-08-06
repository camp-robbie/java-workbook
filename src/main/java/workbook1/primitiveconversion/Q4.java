package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 수를 입력해주세요:");
        float f1 = sc.nextFloat();

        System.out.println("두 번째 수를 입력해주세요:");
        float f2 = sc.nextFloat();
        // TODO: f1을 int로 강제 변환, f2를 double로 자동 변환해 합산 후 출력

        int f1i = (int) f1;
        double f2i = (double) f2;
        double result = f1i + f2i ;

        System.out.println("계산 결과(float+double):" + result);

    }
}