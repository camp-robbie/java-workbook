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
        // long lB = b; -> b 자동 형변환
        // long lS = s; -> s 자동 형변환
        // long lI = i; -> i 자동 형변환
        long sum = b + s + i + l; // b, s, i, l 합산(long 자동 형 변환)

        float fSum = (float) sum; // long -> float 강제 형 변환

        System.out.println(fSum); // 출력
        // System.out.printf("0.1f", fSum);  -> 출력(소숫점 첫째자리까지)
    }
}