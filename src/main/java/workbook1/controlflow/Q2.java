package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        // TODO: count개의 정수를 입력받아 양수 개수와 음수 합을 계산 후 출력

        int positiveCount = 0;//양수 개수를 세는 변수
        int negativeSum = 0;//음수의 합을 저장하는 변수

        //count번 반복하여 정수 입력받기
        for (int i = 0; i < count; i++) {
            int num = sc.nextInt();

            //양수 판별
            if (num > 0) {
                //양수인 경우
                positiveCount++;
            } else if (num < 0) {
                //음수인 경우
                negativeSum += num;
            }
            //0은 패스
        }

        System.out.print(positiveCount + " " + negativeSum);

        sc.close();
    }
}