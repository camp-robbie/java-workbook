package main.java.workbook2.methods;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q1 {
    // TODO: 두 정수를 더해 반환하는 sum 메서드를 작성하세요.
    public int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int a = sc.nextInt(); // 첫번째 입력 값
            int b = sc.nextInt(); // 두번째 입력 값

            // TODO: sum 메서드를 호출하여 결과 출력
            Q1 sum = new Q1(); // 객체 생성
            int result = sum.sum(a, b); // 메서드 호출
            System.out.println(result); // 결과 값 출력
        } catch (InputMismatchException e){ // 숫자 이외의 값을 입력 시
            System.out.println("숫자만을 입력해주세요"); // 예외 처리
        } finally{ // 항상 실행
            sc.close(); // 자원 누수 방지
        }
    }
}
