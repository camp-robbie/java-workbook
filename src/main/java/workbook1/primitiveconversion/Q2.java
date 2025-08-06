package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("doubleNumber = ");
        double doubleNumber = sc.nextDouble();
        // TODO: d를 int로 강제 형변환하여 차이를 계산 후 출력

        // int로 강제 형변환
        int intNumber = (int) doubleNumber;
        System.out.println("intNumber = " + intNumber);

        // 차이를 계산 후 출력
        double result = doubleNumber - intNumber;
        System.out.println("result = " + result);
        
        

    }
}