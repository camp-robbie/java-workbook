package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 실수를 입력하세요 : ");
        float f1 = sc.nextFloat();

        System.out.println("두 번째 실수를 입력하세요 : ");
        float f2 = sc.nextFloat();
        // TODO: f1을 int로 강제 변환, f2를 double로 자동 변환해 합산 후 출력

        // f1을 int로 강제 변환
        int i = (int) f1;

        // f2를 double로 자동 변환해 합산
        double sum = i + f2;

        // 출력
        System.out.printf("계산 결과 : " + sum);
    }
}