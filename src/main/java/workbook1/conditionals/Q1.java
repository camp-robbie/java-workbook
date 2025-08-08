package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // TODO: num의 부호를 판단하여 출력

        int Evensum = 0; //  짝수 합 초기화
        int Oddmul = 1; // 홀수 곱 초기화

        for (int i = 0; i < num; i++) {
            if (i % 2 == 0) {
                Evensum += i;
            } else {
                Oddmul *=i;

            }
        }
        System.out.println(Evensum + " " + Oddmul);
    }

}
