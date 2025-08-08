package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float f1 = sc.nextFloat();
        float f2 = sc.nextFloat();
        // TODO: f1을 int로 강제 변환, f2를 double로 자동 변환해 합산 후 출력
        //강제 형변환 (float->int)
        int f1i = (int) f1;
        //자동 형변환(float -> double)
        double f2d = f2;
        //합산
        double sum = f1i+f2d;
        //출력
        System.out.println(sum);
    }
}