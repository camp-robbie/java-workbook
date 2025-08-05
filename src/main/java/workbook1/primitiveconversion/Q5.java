package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 실수를 입력하세요 : ");
        double x = sc.nextDouble();

        System.out.println("두 번째 실수를 입력하세요 : ");
        double y = sc.nextDouble();

        System.out.println("세 번째 실수를 입력하세요 : ");
        double z = sc.nextDouble();
        // TODO: x, y, z를 int로 변환 후 평균을 float으로 출력

        // x, y, z를 int로 변환
        int xInt = (int) x;
        int yInt = (int) y;
        int zInt = (int) z;

        // 평균을 float로
        float average = (float) (xInt + yInt + zInt) / 3;

        // 출력
        System.out.println("계산 결과 : " + average);
    }
}
