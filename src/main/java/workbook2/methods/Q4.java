package main.java.workbook2.methods;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(average(a,b,c));
    }
    // double 값이 return 되는 3개의 정수를 받는 메서드입니다.
    static double average(int a, int b, int c) {
        return (a+b+c)/3.0; // 값을 double로 고정하기 위해 3.0으로 나눕니다.
    }
}
