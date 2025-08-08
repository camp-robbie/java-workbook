package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        // TODO: count개의 정수를 입력받아 양수 개수와 음수 합을 계산 후 출력
        // N개의 정수를 입력받아 양수의 개수와 음수의 합을 출력하는 프로그램을 작성하시오.
        // 반복문으로 N개의 값을 읽으면서 if 문으로 양수 여부를 판단합니다.

        int positiveCount = 0; // 양수의 개수
        int negativeSum = 0; // 음수의 합

        for (int i = 0; i < count; i++) {
            int num = sc.nextInt(); // 정수 입력

            if (num > 0) { // 양수
                positiveCount++; // 양수면 개수 증가
            } else if (num < 0) { // 음수
                negativeSum += num; // 음수면 합산
            }
        }
        System.out.println(positiveCount + " " + negativeSum);
    }
}