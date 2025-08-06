package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte b = sc.nextByte();
        short s = sc.nextShort();
        int i = sc.nextInt();
        long l = sc.nextLong();

        // TODO: b, s, i, l을 long으로 변환해 합산 후 float으로 변환하여 출력

        long lb = b; // long 으로 자동 형변환
        long ls = s; // long 으로 자동 형변환
        long li = i; // long 으로 자동 형변환
        long sum = lb + ls + li + l; // 합산

        float result = sum; // float으로 자동 형변환

        // 출력
//        System.out.println("lb = " + lb);
//        System.out.println("ls = " + ls);
//        System.out.println("li = " + li);
//        System.out.println("l = " + l);
//        System.out.println("sum = " + sum);
        System.out.println(result);
    }
}