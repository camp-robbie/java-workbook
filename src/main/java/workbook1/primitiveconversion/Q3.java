package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 정수를 입력하세요 : ");
        byte b = sc.nextByte();

        System.out.print("두 번째 정수를 입력하세요 : ");
        short s = sc.nextShort();

        System.out.print("세 번째 정수를 입력하세요 : ");
        int i = sc.nextInt();

        System.out.print("네 번째 정수를 입력하세요 : ");
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
        // float sum = b + s + i + l;

        // 출력
        System.out.println("계산 결과 : " + sum);

        /*
        // solution
        // 모든 값을 long으로 자동 형변환하여 합산
        long sum = b + s + i + l;

        // 결과를 float으로 자동 형변환하여 출력
        float result = sum;
        System.out.println(result);
        */

        sc.close();

    }
}