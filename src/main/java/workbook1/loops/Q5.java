package main.java.workbook1.loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int h = sc.nextInt(); // 입력 값을 변수 h에 저장

            // TODO: 역삼각형 패턴 출력
            // 0을 입력 시 음수와 마찬가지로 아무런 결과가 출력되지 않아서 1 이상을 입력하도록 예외 처리
            if (h < 1) { // 1 미만의 값을 입력 시 예외 처리
                throw new IllegalArgumentException();
            }

            for (int i = h; i > 0; i--) { // i의 값을 입력 값 그대로 저장 후 후위 감소로 반복 할 때마다 -1
                for (int j = i; j > 0; j--) { // j는 i의 값을 입력 받고 저장 후 후위 감소로 반복 할 때마다 -1
                    System.out.print("*"); // 반복할 때마다 하나씩 추가
                }
                System.out.println(); // 줄 바꿈
            }
        } catch (InputMismatchException e) { // 잘못된 입력 값을 받을 시 예외처리
            System.out.println("숫자만을 입력해주세요!");
        } catch (IllegalArgumentException e) { // 조건문에서 발생 시킨 예외를 잡은 후 예외처리
            System.out.println("1이상의 값을 입력해주세요!");
        }

        sc.close(); // 자원 누수 방지
    }
}
