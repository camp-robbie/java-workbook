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

        //long으로 자동 형변환 후 합 구하기
        long longResult = b + s + i + l;

        //long 결과를 float형으로 다시 변환하여 출력
        float floatResult = longResult;
        System.out.println(floatResult);

        sc.close();
    }
}