package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float f1 = sc.nextFloat(); // 첫번째 입력 값
        float f2 = sc.nextFloat(); // 두번째 입력 값

        int num1 = (int)f1; // int로 강제 변환

        double num2 = f2; // double로 자동 형변환

        double sum = num1 + num2; // 연산 결과를 sum에 저장

        System.out.printf("%.1f",sum); // printf()을 활용하여 불필요한 소숫점 제거
    }
}