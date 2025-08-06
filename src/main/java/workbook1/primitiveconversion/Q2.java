package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        // TODO: d를 int로 강제 형변환하여 차이를 계산 후 출력

        int e = (int) d;
        double result= (int)e - (double)d;

        System.out.println("--- 첫 번째 형변환 ---");
        System.out.println("실수 - 정수 = " + result);

        // 혹은 박스개념으로 형변환 가능(업캐스팅, 다운 캐스팅)
        double bigbox = sc.nextInt();
        int smallBox = (int) bigbox;
        result2 = bigbox - smallbox;

        System.out.println("실수 - 정수 = " + result2);
    }
}