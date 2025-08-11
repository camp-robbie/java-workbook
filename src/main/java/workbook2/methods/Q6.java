package main.java.workbook2.methods;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q6 {
    // TODO: 재귀를 이용한 factorial 메서드 작성
    public int factorial(int n) {
        if (n == 0) { // 0일 때
            return 1; // 1로 반환
        }
        // factorial(n - 1) 자기 자신을 호출하며 if문의 조건이 충족될 때까지 반복
        // 예시) 5를 입력, 5*(5-1)*(4-1)*(3-1)*(2-1)*1(n이 0일 때 1을 반환하며 종료) = 120
        return n * factorial(n - 1); // 재귀 함수 활용
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt(); // 입력 값

            if (n < 0) { // n이 음수라면
                throw new IllegalArgumentException(); // 예외 생성
            }
            // TODO: factorial 호출 후 결과 출력
            Q6 result = new Q6(); // 객체 생성
            System.out.println(result.factorial(n)); // 결과 출력
        } catch (InputMismatchException e) { // 숫자 이외의 입력 시
            System.out.println("숫자만 입력해 주세요!"); // 예외 처리
        } catch (IllegalArgumentException e) { // 0을 입력 값으로 받을 시
            System.out.println("음수를 입력하실 수 없습니다."); // 예외 처리
        } finally { // 항상 실행
            sc.close(); // 자원 누수 방지
        }
    }
}
