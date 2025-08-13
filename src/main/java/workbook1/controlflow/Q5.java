package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // TODO: 각 자리수의 합을 반복해 한 자리 수가 될 때까지 계산 후 출력
        // 반복문과 조건문의 조합으로 자리수 합을 반복 계산

        while (num > 10) {      // 주어진 숫자가 두 자리 이상 일 경우 반복
            int sum = 0;        // 자리수 합 초기화

            while(num > 0) {
                sum += num % 10; // 나머지 수 sum에 합산
                num /= 10;
            }
            num = sum;
        }
        System.out.println(num);
        sc.close();
    }
}