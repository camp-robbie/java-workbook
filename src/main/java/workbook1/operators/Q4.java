package main.java.workbook1.operators;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // b가 a보다 크고 c보다 작은지 평가
        boolean d = (b>a)&&(b<c);
        //출력
        System.out.println(d);
    }
}