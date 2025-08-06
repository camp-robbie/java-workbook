package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        // TODO: x, y, z를 int로 변환 후 평균을 float으로 출력

        int ix = (int) x;
        int iy = (int) y;
        int iz = (int) z;

        int avg = (ix + iy + iz) / 3;
        float avgf = avg;

//        System.out.println("ix = " + ix);
//        System.out.println("iy = " + iy);
//        System.out.println("iz = " + iz);
//        System.out.println("avg = " + avg);
        System.out.println("avgf = " + avgf); // 출력
    }
}
