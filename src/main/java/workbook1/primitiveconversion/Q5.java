package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();

        // TODO: x, y, z를 int로 변환 후 평균을 float으로 출력
        int xInt = (int)x;      // x를 double형에서 int형으로 강제 형변환하여 변수 xInt에 저장함
        int yInt = (int)y;      // y를 double형에서 int형으로 강제 형변환하여 변수 yInt에 저장함
        int zInt = (int)z;      // z를 double형에서 int형으로 강제 형변환하여 변수 zInt에 저장함

        float average = (xInt + yInt + zInt) / 3.0f;     // 3.0f로 나누어줘서 소수점이 잘리지 않도록 하여 float형 average에 저장함
        System.out.printf("sum = %.1f", average);        // printf문을 사용하여 소수점 첫째 자리까지 출력함
    }
}
