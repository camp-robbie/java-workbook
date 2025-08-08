package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 실수를 입력하세요 : ");
        float f1 = sc.nextFloat();

        System.out.print("두 번째 실수를 입력하세요 : ");
        float f2 = sc.nextFloat();
        // TODO: f1을 int로 강제 변환, f2를 double로 자동 변환해 합산 후 출력

        // f1을 int로 강제 변환
        int i = (int) f1;

        // f2를 double로 자동 변환해 합산
        double sum = i + f2;

        // 출력
        System.out.println("계산 결과 : " + sum);

        /*
        // solution
        // f1을 int로 강제 형변환 (소수부 제거)
        int intValue = (int) f1;

        // f2를 double로 자동 형변환
        double doubleValue = f2;

        // 두 값의 합을 계산 (int가 자동으로 double로 변환됨)
        double sum = intValue + doubleValue;

        // 결과 출력
        System.out.println(sum);
        */

        sc.close();

    }
}