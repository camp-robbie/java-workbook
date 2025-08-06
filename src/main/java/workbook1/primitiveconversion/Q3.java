package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input byte = ");
        byte b = sc.nextByte();

        System.out.println("please input short = ");
        short s = sc.nextShort();

        System.out.println("please input int = ");
        int i = sc.nextInt();

        System.out.println("please input long = ");
        long l = sc.nextLong();
        // TODO: b, s, i, l을 long으로 변환해 합산 후 float으로 변환하여 출력

        long sum = b + s + i + l;
        float result = (float) sum;

        System.out.println("float 합산 결과 = " + result);

    }
}