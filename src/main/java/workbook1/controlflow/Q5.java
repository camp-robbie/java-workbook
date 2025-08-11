package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // TODO: 각 자리수의 합을 반복해 한 자리 수가 될 때까지 계산 후 출력

        while (num >= 10) {
            int sum = 0;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        System.out.println(num);

        sc.close();

        /*
        // solution
        // 이 과정을 "디지털 루트(Digital Root)" 또는 "반복 디지털 합"이라고 부르기도 한다.
        */
    }
}