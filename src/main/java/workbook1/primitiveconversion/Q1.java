package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // TODO: a와 b를 double로 자동 형변환하여 더한 뒤 int로 강제 변환하여 출력
        //자동 형변환(정수→실수)과 강제 형변환(실수→정수)을 모두 사용


        double sumDouble = (double)a + (double)b;
        int result = (int) sumDouble;

        System.out.println("--- 첫 번째 형변환 ---");
        System.out.println("형변환 (실주->정수) 계산 결과 = " + result);
        System.out.println("형변환 (정수->실수) 계산 결과 = " + sumDouble);

        // 혹은 박스개념으로 형변환 가능(업캐스팅, 다운 캐스팅)
        int smallBox1 = sc.nextInt();
        int smallBox2 = sc.nextInt();

        double bigBox = smallBox1 + smallBox2;
        // 큰 박스를 작은 박스로 강제 형변환
        int result2 = (int) bigBox;
        System.out.println("--- 두 번째 형변환 (박스 개념) ---");
        System.out.println("형변환 (실주->정수) 계산 결과 = " + result2);
        System.out.println("형변환 (정수->실수) 계산 결과 = " + bigBox);

    }
}