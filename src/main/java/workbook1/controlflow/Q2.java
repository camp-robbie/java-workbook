package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        // TODO: count개의 정수를 입력받아 양수 개수와 음수 합을 계산 후 출력
        // 반복문으로 N개의 값을 읽으면서 if 문으로 양수 여부를 판단

        int positiveCount = 0;   // 양수 개수 출력하기 위한 변수
        int negativeSum = 0;     // 음수 합을 출력하기 위한 변수

        for(int i = 0; i < count; i++) {    // i는 0이고, i가 count보다 작을동안 1씩 증가시키며 반복함
            int num = sc.nextInt();         // 숫자를 입력 받음
            if(num > 0) {                   // num이 0보다 크면
                positiveCount++;            // positiveCount를 1 증가시킴
            } else if(num < 0) {            // num이 0보다 작으면
                negativeSum += num;         // negativeSum = negativeSum + num;
            }
        }

        System.out.println(positiveCount + " " + negativeSum);      // 결과를 출력함


    }
}