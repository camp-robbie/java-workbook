package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("a를 입력하세요 : ");
        int a = sc.nextInt();
        System.out.println("b를 입력하세요 : ");
        int b = sc.nextInt();
        // TODO: a와 b를 double로 자동 형변환하여 더한 뒤 int로 강제 변환하여 출력

        //int->double 작은 자료형->큰 자료형 자동형변환
        double a_num = a;
        double b_num = b;

        //double->int 큰 자료형->작은 자료형 강제형변환
        double c_num = a_num + b_num;
        int c = (int)c_num;

        System.out.println(c);
    }
}