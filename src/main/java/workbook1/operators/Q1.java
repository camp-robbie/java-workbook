package main.java.workbook1.operators;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //각 연산(+,-,*,/)들을 변수에 담기
        int sum = a+b;
        int diff = a-b;
        int mul = a*b;
        int quot = a/b;
        int rem = a%b;
        //출력
        System.out.println(sum+" "+diff+" "+mul+" "+quot+" "+rem);
    }
}