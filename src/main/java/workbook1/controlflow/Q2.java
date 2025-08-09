package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        // TODO: count개의 정수를 입력받아 양수 개수와 음수 합을 계산 후 출력

        /*
        // solution
        // 변수명을 직관적으로 짓기!
        int positiveCount = 0;  // 양수의 개수
        int negativeSum = 0;    // 음수의 개수
        */

        int num1 = 0;   // 양수
        int num2 = 0;   // 음수

        for (int i = 0; i < count; i++) {
            int num = sc.nextInt();
            if (num > 0) {
                num1++;
            } else {
                num2 += num;
            }
        }
        System.out.println(num1 + " "  + num2);

        sc.close();
    }
}