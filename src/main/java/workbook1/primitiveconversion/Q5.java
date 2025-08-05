package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();

        // x, y, z를 int로 강제 형변환
        int a = (int) x;
        int b = (int) y;
        int c = (int) z;

        float result = (float) (a + b + c) / 3; // 3개의 값의 평균을 구하고 float로 자동 형변환 및 result에 저장
        System.out.printf("%.1f", result); // 결과 값을 소숫점 한자리까지 표현
    }
}
