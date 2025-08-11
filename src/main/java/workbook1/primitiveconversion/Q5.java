package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        // TODO: x, y, z를 int로 변환 후 평균을 float으로 출력

        Scanner sc = new Scanner(System.in);

        // x, y, z를 입력 받는다.
        System.out.print("x: ");
        double x = sc.nextDouble();
        System.out.print("y: ");
        double y = sc.nextDouble();
        System.out.print("z: ");
        double z = sc.nextDouble();

        // 입력받은 숫자를 int로 변환한다.
        int xx = (int) x;
        int yy = (int) y;
        int zz = (int) z;

        // 평균을 float으로 출력한다.
        float avg = (xx + yy + zz) / 3f;
        System.out.println("float avg = " + avg);

    }
}
