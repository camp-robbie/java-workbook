package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 숫자를 입력 받기
        System.out.print("b: ");
        byte b = sc.nextByte();
        System.out.print("s: ");
        short s = sc.nextShort();
        System.out.print("i: ");
        int i = sc.nextInt();
        System.out.print("j: ");
        long l = sc.nextLong();
        // TODO: b, s, i, l을 long으로 변환해 합산 후 float으로 변환하여 출력

        // long으로 변환해 합산
        long sum = b + s + i + l;

        // float으로 변환하여 출력
        float result = (float) sum;
        System.out.println("result = " + result);

    }
}