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

        long sum = b + s + i + l;                // long형으로 자동 형변환하여 합을 구하여 sum 변수에 저장함

        float sumFloat = (float) sum;                  // sum을 float형으로 강제 형변환하여 변수 sumFloat에 저장함
        System.out.println("sumFloat = " + sumFloat);  // float형으로 강제 형변환이 제대로 적용되었는지 확인하기 위해서 출력함
    }
}