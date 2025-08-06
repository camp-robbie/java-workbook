package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        // TODO: b, s, i, l을 long으로 변환해 합산 후 float으로 변환하여 출력
        Scanner sc = new Scanner(System.in);
        byte b = sc.nextByte();
        short s = sc.nextShort();
        int i = sc.nextInt();
        long l = sc.nextLong();

        long sum = (long) b + (long) s + (long) i + l;
        // l 제외 전부 강제 형변환하여 계산

        float result = (float) sum;
        // 다시 float으로 강제 형변환

        System.out.println(result);
    }
}