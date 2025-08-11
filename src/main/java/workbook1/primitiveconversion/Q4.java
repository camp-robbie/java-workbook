package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float f1 = sc.nextFloat();

        // float 값을 double에 넣음으로 자동으로 형변환 됩니다.
        double f2 = sc.nextFloat();

        // f1을 int로 강제 형변환하며 둘의 합을 출력합니다.
        System.out.println((int)f1+f2);
    }
}