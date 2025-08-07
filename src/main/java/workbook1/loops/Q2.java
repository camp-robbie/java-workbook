package main.java.workbook1.loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try { // 숫자만을 입력하도록 예외 처리
            int n = sc.nextInt();
            // TODO: 홀수 합과 짝수 합 계산 후 출력
            int isOdd = 0; // 홀수의 합을 저장할 변수
            int isEven = 0; // 짝수의 합을 저장할 변수

            if (n < 0) { //IllegalArgumentException은 잘못된 인수 값이 전달될 때 발생하는 예외처리
                throw new IllegalArgumentException(); // 음수를 입력 시 예외 처리
            }

            // 음수 이외의 숫자 값을 입력시 홀수와 짝수 각각의 합을 구할 반복문 실행
            for (int i = 1; i <= n; i += 2) { // 홀수의 합을 구할 반복문 // 반복할 때마다 i의 값을 +2를 증가시킨다.
                isOdd += i; // isOdd = isOdd + i;
            }
            for (int i = 2; i <= n; i += 2) { // 짝수의 합을 구할 반복문 // 반복할 때마다 i의 값을 +2를 증가시킨다.
                isEven += i; // isEven = isEven + i;
            }

            // 각각의 결과 값 출력
            System.out.println("홀수의 합은 = " + isOdd + " 짝수의 합은 = " + isEven);
        } catch (InputMismatchException e) { // InputMismatchException은 입력 값이 불일치 할 시 발생하는 예외처리
            System.out.println("숫자만을 입력해주세요."); // 숫자 이외의 값을 입력 시 예외처리
        } catch (IllegalArgumentException e) { // 조건문으로 생성한 예외를 catch로 잡아서 메세지를 출력한다.
            System.out.println("0 이상의 값을 입력해주세요..");
        }

        sc.close(); // 자원 손실 방지
    }
}
