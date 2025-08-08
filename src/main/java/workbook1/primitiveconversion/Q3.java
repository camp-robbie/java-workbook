package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte b = sc.nextByte();
        short s = sc.nextShort();
        int i = sc.nextInt();
        long l = sc.nextLong();

        //b, s, i, l을 long으로 변환
        long lb = b;
        long ls = s;
        long li = i;

        //변환된 b,s,i,l 합산
        long sum = lb+ls+li+l;

        //합산한 값을 float로 변환(long->float 자동 형변환)
        float result = sum ;

        //출력하기
        System.out.println(result);
    }
}