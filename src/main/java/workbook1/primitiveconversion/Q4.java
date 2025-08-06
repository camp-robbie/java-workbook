package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 실수형 숫자를 입력해주세요 : ");
        float f1 = sc.nextFloat();
        System.out.println("두 번째 실수형 숫자를 입력해주세요 : ");
        float f2 = sc.nextFloat();
        // TODO: f1을 int로 강제 변환, f2를 double로 자동 변환해 합산 후 출력

        //4byte 정수형타입 -> 4byte 실수형타입
        int f1_num = (int)f1;
        //4byte 실수형타입 -> 8byte 실수형타입
        double f2_num = f2;

        double sum = f1_num + f2_num;
        System.out.printf("두 값의 합 : %.1f", sum);
    }
}