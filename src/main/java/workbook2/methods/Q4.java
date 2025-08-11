package main.java.workbook2.methods;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q4 {
    // TODO: 세 정수의 평균을 반환하는 average 메서드 작성
    // 반환형은 double, 메서드 이름은 average, 매개변수는 세 개의 int
    public double average(int a, int b, int c) {
        return (double) (a + b + c) / 3; // 세 정수의 평균 반환
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt(); // 첫번째 입력 값
            int b = sc.nextInt(); // 두번째 입력 값
            int c = sc.nextInt(); // 세번째 입력 값

            // TODO: average 호출 후 결과 출력
            Q4 result = new Q4(); // 객체 생성

            System.out.println(result.average(a, b, c)); // 출력(메서드 호출)
        } catch (InputMismatchException e) { // 숫자 이외의 입력 시
            System.out.println("숫자만 입력해 주세요!"); // 예외 처리
        } finally { // 항상 실행
            sc.close(); // 자원 누수 방지
        }
    }
}
