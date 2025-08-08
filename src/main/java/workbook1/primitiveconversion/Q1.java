package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        // 스캐너를 통해 숫자를 입력 받음
        Scanner sc = new Scanner(System.in);
        System.out.print("number1: ");
        int a = sc.nextInt();
        System.out.print("number2: ");
        int b = sc.nextInt();
        // TODO: a와 b를 double로 자동 형변환하여 더한 뒤 int로 강제 변환하여 출력

        // double로 자동 형변환 하여 변수에 저장
        double doublenumber = a + b;
        // 출력
        System.out.println("doublenumber = " + doublenumber);

        // double로 저장된 숫자를 int형으로 강제 형변환 후
        int intnumber = (int) doublenumber;
        // 출력
        System.out.println("intnumber = " + intnumber);

    }
}