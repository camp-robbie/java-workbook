package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        // TODO: d를 int로 강제 형변환하여 차이를 계산 후 출력

        //강제 형변환 double -> int
        int a = (int) d;

        //차이 계산식 작성
        double result = d - a;

        System.out.println(result);

        sc.close();
    }
}