package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        // TODO: d를 int로 강제 형변환하여 차이를 계산 후 출력

        Scanner sc = new Scanner(System.in);

        // double num을 입력 받는다.
        System.out.print("Num: ");
        double d = sc.nextDouble();
        System.out.println("double Num = " + d);

        // int로 강제 형 변환한다.
        int intNum = (int) d;
        System.out.println("doubleNum to intNum = " + intNum);

        // 차이를 계산한 후 출력한다.
        double difference = (double) d - intNum;
        System.out.println("difference = " + difference);

    }
}