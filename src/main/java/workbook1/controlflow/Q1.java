package main.java.workbook1.controlflow;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            int sum = 0; // 짝수의 합을 저장할 변수
            int mul = 1; // 홀수의 곱을 저장할 변수

            if (n < 0) { // 음수를 입력 시
                throw new IllegalArgumentException();
            }

            // TODO: 짝수는 합, 홀수는 곱에 반영 후 최종 결과 출력
            for (int i = 1; i <= n; i++) { // 입력 값과 같아 질 때까지 반복
                if (i % 2 == 0) { // 짝수를 찾는 조건
                    sum += i; // sum = sum + i;
                } else if (i % 2 == 1) { // 홀수를 찾는 조건
                    mul *= i; // mul = mul * i;
                }
            }

            // 결과 값 출력
            System.out.println("짝수의 합은 = " + sum + " 홀수의 곱은 = " + mul);
            sc.close(); // 자원 누수 방지
        } catch (InputMismatchException e) { // 숫자 이외의 값을 입력 시
            System.out.println("숫자만을 입력해주세요!");
        } catch (IllegalArgumentException e) { // 조건문으로 발생 시킨 예외를 잡아서 예외처리
            System.out.println("음수를 입력하실 수 없습니다!");
        }
    }
}
