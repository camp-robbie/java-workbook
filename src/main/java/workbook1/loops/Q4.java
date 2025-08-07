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
            if (n < 0 || m < 0) { // n이나 m이 0 미만일 때 예외처리
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
        } catch (IllegalArgumentException e) { // 음수가 입력되었을 때 발생
            System.out.println("음수를 입력하실 수 없습니다!");
        }
    }
}
