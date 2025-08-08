package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float f1 = sc.nextFloat();
        float f2 = sc.nextFloat();
        // TODO: f1을 int로 강제 변환, f2를 double로 자동 변환해 합산 후 출력
        int iF1 = (int)f1; // 첫번째 값(f1) 강제 형 변환 (float -> int)
        double dF2 = f2; // 두번째 값(f2) 자동 형 변환 (float -> double)

        double sum = iF1 + (int)dF2;
        // double sum = iF1 + dF2 할 경우 iF1=2 / dF2=3.7 => sum 5.7로 계산 됨

        System.out.println(sum);

        // 2번째 방법
        // float sum = iF1 + (int)dF2;
        // System.out.println(sum);

    }
}