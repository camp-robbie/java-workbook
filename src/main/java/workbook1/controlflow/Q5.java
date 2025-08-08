package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // TODO: 각 자리수의 합을 반복해 한 자리 수가 될 때까지 계산 후 출력
        // 0 이상의 정수를 입력받아 각 자리수의 합이 한 자리 수가 될 때까지 반복적으로 각 자리수의 합을 구하는 프로그램을 작성하시오.
        // 반복문과 조건문을 조합하여 자리수 합을 반복 계산합니다.

        while (num >= 10) { // 두 자리 이상일 경우 반복
            int sum = 0; // 자리수 합 초기화

            while (num > 0) {
                sum += num % 10; // 나머지 수(마지막 자리 수) sum에 합산
                num /= 10; // 마지막 자리 수() 제거
            }
            num = sum; // 자리수 합 다시 num에 저장하면서 반복
        }
        System.out.println(num); // 출력
    }
}