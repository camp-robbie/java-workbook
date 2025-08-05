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

        // 1. 단계별
        // b, s, i, l을 long으로 변환
        long bLong = b;
        long sLong = s;
        long iLong = i;

        // 합산
        float sum = bLong + sLong + iLong + l;

        // 2. 한번에
        // float sum = (long) b + (long) s + (long) i + l;

        // 출력
        System.out.println(sum);
    }
}