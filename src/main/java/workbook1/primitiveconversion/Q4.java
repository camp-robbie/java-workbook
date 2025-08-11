package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float f1 = sc.nextFloat();
        float f2 = sc.nextFloat();
        // TODO: f1을 int로 강제 변환, f2를 double로 자동 변환해 합산 후 출력

        //첫 번째 float값을 int로 강제 형변환
        int i1 = (int)f1;

        //두 번째 값은 자동 형변환을 이용하여 double로 변환한 후 두 값의 합 구하기
        double doubleResult = i1 + f2;

        System.out.println(doubleResult);

        sc.close();
    }
}