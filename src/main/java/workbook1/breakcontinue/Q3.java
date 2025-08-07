package main.java.workbook1.breakcontinue;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: 음수가 나오면 break, 양수 평균 출력
        try {
            int sum = 0; // 양수들의 합을 담을 변수
            int count = 0; // 반복문 횟수를 담을 변수

            while (true) {
                int n = sc.nextInt(); // 반복 입력
                if (n < 0) { // 만약 입력 값이 음수라면
                    break;
                }
                sum += n; // 양수일 때 sum = sum + n;
                count++; // 반복문 실행 될 때 +1;
            }

            double positive = (double) sum / count; // (double로 형변환) 양수의 합 / 입력된 횟수
            System.out.println("양수들의 평균 = " + positive);
            sc.close(); // 자원 누수 방지
        } catch (InputMismatchException e) {
            System.out.println("숫자만 입력해주세요!");
        }
    }
}