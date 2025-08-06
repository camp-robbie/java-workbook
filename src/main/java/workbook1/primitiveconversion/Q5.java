package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        // TODO: x, y, z를 int로 변환 후 평균을 float으로 출력
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();

        float ave = (float) (((int) x + (int) y + (int) z) / 3);
        // 두 번의 강제 형변환을 하나로 결합

        System.out.println(ave);
    }
}
