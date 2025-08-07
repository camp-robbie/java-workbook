package main.java.workbook1.loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int m = sc.nextInt(); // 행의 값
            int n = sc.nextInt(); // 열의 값

            // TODO: 이중 for 문으로 별 패턴 출력
            // 0을 입력 시 음수와 마찬가지로 아무런 결과가 출력되지 않아서 1 이상을 입력하도록 예외 처리
            if (n < 1 || m < 1) { // n이나 m이 1 미만일 때 예외처리
                throw new IllegalArgumentException();
            }

            for (int i = 0; i < m; i++) { // 행을 담당
                for (int j = 0; j < n; j++) { // 열을 담당
                    System.out.print("*"); //반복하는 수 많큼 반복되어 입력
                }
                System.out.println(); // println을 사용함으로써 줄을 변경한다.
            }
        } catch (InputMismatchException e) { // 입력 값이 불일치할 때 발생
            System.out.println("숫자만 입력해주세요!");
        } catch (IllegalArgumentException e) { // 조건문에서 발생 시킨 예외를 잡은 후 예외처리
            System.out.println("1이상의 값을 입력해주세요!");
        }

        sc.close(); // 자원 손실 방지
    }
}
