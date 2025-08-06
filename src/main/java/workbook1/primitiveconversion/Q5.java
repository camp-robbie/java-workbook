package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 스캐너로 입력 받기
        System.out.print("x = ");
        double x = sc.nextDouble();
        System.out.print("y = ");
        double y = sc.nextDouble();
        System.out.print("z: ");
        double z = sc.nextDouble();
        // TODO: x, y, z를 int로 변환 후 평균을 float으로 출력

        // int로 변환
        int xx = (int) x;
        int yy = (int) y;
        int zz = (int) z;

        // 평균을 float으로 출력
        float result = (xx + yy + zz) / 3;
        System.out.println("result = " + result);

    }
}
