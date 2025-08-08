package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        byte b = sc.nextByte();
        short s = sc.nextShort();
        int i = sc.nextInt();
        long l = sc.nextLong();

        // 연산 과정에서 가장 범위가 큰 long 으로 자동 형변환 되고,
        // long 보다 float 가 표현할 수 있는 값의 범위가 크기 때문에
        // 자동으로 형변환 됩니다.
        float f = b+s+i+l;

        System.out.println(f);
    }
}