package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("실수형 숫자를 입력하세요 : ");
        double d = sc.nextDouble();
        // TODO: d를 int로 강제 형변환하여 차이를 계산 후 출력

        //double->int 큰 자료형->작은 자료형 강제형변환
        int d_num = (int)d;
        double a_num = d - d_num;
        System.out.println("강제 형변환 후의 값 : " + d_num);
        System.out.printf("원래 %.1f의 차이 : ", a_num);
    }
}