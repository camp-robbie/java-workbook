package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        // TODO: b, s, i, l을 long으로 변환해 합산 후 float으로 변환하여 출력

        Scanner sc = new Scanner(System.in);

        // 각 타입에 숫자를 입력 받는다.
        System.out.print("byte: ");
        byte b = sc.nextByte();
        System.out.print("short: ");
        short s = sc.nextShort();
        System.out.print("int: ");
        int i = sc.nextInt();
        System.out.print("long: ");
        long l = sc.nextLong();

        // long으로 변환 후 합산한다.
        long longSum = (long) b + s + i + l;
        System.out.println("longSum = " + longSum);

        // float으로 변환 후 출력
        float floatSum = (float) longSum;
        System.out.println("Long sum to float sum: " + floatSum);

    }
}