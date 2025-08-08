package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("count할 숫자를 입력하세요 : ");
        int count = sc.nextInt();
        // TODO: count개의 정수를 입력받아 양수 개수와 음수 합을 계산 후 출력

        int positiveCount = 0;
        int negativeSum = 0;

        System.out.println(count + "개의 정수를 입력하세요:");
        for (int i = 0; i < count; i++) {
            int number = sc.nextInt();
            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeSum += number;
            }
        }

        System.out.println("양수의 개수: " + positiveCount);
        System.out.println("음수의 합: " + negativeSum);
    }
}