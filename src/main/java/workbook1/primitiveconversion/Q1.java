package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력값을 받습니다.
        // 받는 형태는 정수이지만, 변수의 타입이 실수형이므로 자동으로 형변환 됩니다.
        double a = sc.nextInt();
        double b = sc.nextInt();

        // (int) 를 사용하여 강제 형변환 해줍니다.
        System.out.println((int)(a+b));
    }
}