package main.java.workbook1.controlflow;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            int result = 0; // 5의 배수의 갯수를 담을 변수

            // TODO: 1~n까지 중 자리수 합이 5의 배수인 수의 개수 출력
            if(n<1){ // 조건이 1 이상의 수
                throw new IllegalArgumentException();
            }

            for (int i = 1; i <= n; i++) { // 입력 받은 값까지 반복한다.
                int temporary = i; // i의 값을 temporary 변수에 임시로 저장한다.
                int sum = 0; // 자릿수의 합을 담을 변수이기 때문에 항상 초기화 필수

                while (temporary > 0) { // 0이상이면
                    sum += temporary % 10; // 한자리씩 꺼내준다.
                    temporary /= 10; // 한자리씩 제거
                }

                if (sum % 5 == 0) { // 만약 자릿수의 합이 5의 배수라면
                    result++; // 출력 값에 +1 카운트
                }
            }

            System.out.println("자릿수 합이 5의 배수인 수의 개수는 = " + result);
            sc.close(); // 자원 누수 방지
        } catch (InputMismatchException e) { // 숫자 이외의 값 입력시 예외처리
            System.out.println("숫자만을 입력해 주세요!");
        } catch (IllegalArgumentException e) { // 조건문에서 잡힌 throw 잡아서 예외처리
            System.out.println("1 이상의 정수만 입력해주세요!");
        }

    }
}