package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();           // 입력 : 5 - 5개의 숫자를 받겠다~
        // TODO: count개의 정수를 입력받아 양수 개수와 음수 합을 계산 후 출력

        // 양수의 개수
        int positveNumCount = 0;

        // 음수의 합
        int minusNumSum = 0;
                                // 입력 1 -2 3 -4 5
        for (int i = 0; i < count; i++) {  // i <= count :: 6번 // i < count :: 5번 반복
            int num = sc.nextInt();         // 각 반복마다 1번씩 1 숫자를 읽고

            if (num > 0) {          // 양수 판별        // 1 3 5
                positveNumCount++; // 양수면 개수 증가    // 양수 3개
            } else if (num < 0) {   // 음수 판별        // -2  -4
                minusNumSum += num; // 음수면 합산       // 절대값 무시? 합산 -6
            }
        }

        System.out.println(positveNumCount +" " + minusNumSum);
    }
}