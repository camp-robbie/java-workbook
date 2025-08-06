package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        // TODO: x, y, z를 int로 변환 후 평균을 float으로 출력
        int intX = (int) x;
        int intY = (int) y;
        int intZ = (int) z;

        int sum = intX + intY + intZ;

        float average = (float) sum / 3;
        System.out.println(average);
        sc.close();

    }
}
