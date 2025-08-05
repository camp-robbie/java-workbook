package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 정수를 입력하세요 : ");
        byte b = sc.nextByte();

        System.out.println("두 번째 정수를 입력하세요 : ");
        short s = sc.nextShort();

        System.out.println("세 번째 정수를 입력하세요 : ");
        int i = sc.nextInt();

        System.out.println("네 번째 정수를 입력하세요 : ");
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
        System.out.println("계산 결과 : " + sum);
    }
}