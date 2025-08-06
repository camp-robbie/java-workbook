package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 수를 입력해주세요:");
        double x = sc.nextDouble();

        System.out.println("두 번째 수를 입력해주세요:");
        double y = sc.nextDouble();

        System.out.println("세 번째 수를 입력해주세요:");
        double z = sc.nextDouble();
        // TODO: x, y, z를 int로 변환 후 평균을 float으로 출력

        int ix = (int) x;
        int iy = (int) y;
        int iz = (int) z;

        float average = (ix + iy + iz) / 3.0f; // 전체 수식이 실수 나누셈으로 변환되록 나누는 수에 f 붙임.
        System.out.println("세수의 평균 = " + average);

    }
}
