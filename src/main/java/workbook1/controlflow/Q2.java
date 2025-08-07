package main.java.workbook1.controlflow;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int count = sc.nextInt(); // 입력을 원하는 정수의 갯수
            int positive = 0; // 양수의 갯수를 담을 변수
            int negative = 0; // 음수의 합을 담을 변수

            // TODO: count개의 정수를 입력받아 양수 개수와 음수 합을 계산 후 출력
            System.out.println(count + "개의 정수를 입력해 주세요."); // 원하는 정수의 갯수와 함께 출력

            for (int i = 1; i <= count; i++) { // 입력 값만큼 반복문 실행
                int num = sc.nextInt(); // 정수를 입력 받아 변수 num에 저장
                if (num > 0) { // 양수 일 때
                    positive++; // 변수의 값 1씩 증가
                } else if (num < 0) { // 음수 일 때
                    negative += num; // negative = negative + num;
                } else {
                    System.out.println("0은 양수도 음수도 아닙니다."); // 0은 양수, 음수가 아니기 때문에 예외처리
                    i--; // 0을 입력하여 증가된 카운트를 다시 -1을 하면서 다시 입력 받을 수 있게 한다.
                }
            }

            System.out.println("양의 갯수는 = " + positive + " 음수의 합은 = " + negative); // 결과 값 출력
            sc.close(); // 자원 누수 방지
        } catch (InputMismatchException e) { // 숫자 이외의 값을 입력 시 예외처리
            System.out.println("숫자만을 입력해 주세요!");
        }
    }
}