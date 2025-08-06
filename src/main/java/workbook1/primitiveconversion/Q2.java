package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double d = sc.nextDouble();

        // d 를 int 로 강제 형변환 한 뒤 빼줍니다.
        // double 과 연산한 결과는 자동적으로 double이 됩니다.
        System.out.println(d-(int)d);
    }
}