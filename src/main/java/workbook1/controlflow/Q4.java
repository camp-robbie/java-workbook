package main.java.workbook1.controlflow;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO: 0이 나올 때까지 양수만 합산하는 코드 작성
        try {
            int sum = 0; // 모든 양수의 합을 더할 변수

            while (true) { // true라서 조건 없이 반복문 실행
                int n = sc.nextInt(); // 0이 입력되지 않는 이상 계속 반복하여 입력 값을 받는다
                if (n > 0) {
                    sum += n; // 입력 값이 양수라면 더한다
                } else if (n == 0) { // 입력 값이 0 이면
                    break; // 반복 종료
                }
            }

            System.out.println("양수의 합은 = " + sum);
        } catch (InputMismatchException e) {
            System.out.println("숫자만을 입력해 주세요!");
        }
    }
}