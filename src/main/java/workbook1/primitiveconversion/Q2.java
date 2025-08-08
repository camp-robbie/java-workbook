package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();

        //강제 형변환(double->int) 값 변수 i에 담기
        int i = (int) d;

        //강제 형변환값과 원래 값 차이 구하기
        double diff = d-i;

        //출력
        System.out.println(diff);

    }
}