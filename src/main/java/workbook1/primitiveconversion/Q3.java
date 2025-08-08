package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수형 숫자(1바이트)를 입력하세요 :");
        byte b = sc.nextByte();
        System.out.println("정수형 숫자(2바이트)를 입력하세요 :");
        short s = sc.nextShort();
        System.out.println("정수형 숫자(4바이트)를 입력하세요 :");
        int i = sc.nextInt();
        System.out.println("정수형 숫자(8바이트)를 입력하세요 :");
        long l = sc.nextLong();
        // TODO: b, s, i, l을 long으로 변환해 합산 후 float으로 변환하여 출력

        //1,2,4 정수형타입->8 정수형타입 작은 자료형->큰 자료형 자동형변환
        long b_num = b;
        long s_num = s;
        long i_num = i;

        //long 8byte->float 4byte 큰 자료형->작은 자료형 강제형변환
        long sum = b_num + s_num + i_num + l;
        float sum_num = sum;

        System.out.println("float형변환 더한 값입니다." + sum_num);
    }
}