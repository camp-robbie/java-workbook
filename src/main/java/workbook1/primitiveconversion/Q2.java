package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        // TODO: d를 int로 강제 형변환하여 차이를 계산 후 출력

        System.out.println(d);
        System.out.println((int)d);
        System.out.println( d -((int)d)  );
    }
}