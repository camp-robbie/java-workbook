package main.java.workbook1.controlflow;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int n = sc.nextInt();

            if(n<1){
                throw new IllegalArgumentException();
            }
            // TODO: 1~n까지의 소수를 찾아 출력
            for (int i = 2; i <= n; i++) { // 1은 소수가 아니임으로 2부터 시작, 입력 값 이하까지 반복
                boolean prime = true; // 기본 값을 true로 설정하고

                for (int j = 2; j < i; j++) { // 2부터 i 미만 까지 소수가 있는 지 찾는 조건
                    if (i % j == 0) { // 나눠진 후 몫이 0이면 소수가 아니다.
                        prime = false; // 나눠지면 false로 변환된다.
                        break; // 현 반복문 탈출
                    }
                }

                //prime = false면 아래의 if문이 동작하지 않고 다시 입력 값 이하까지 반복
                if (prime) { // 소수들만 출력
                    System.out.print(i + " ");
                }
            }
        } catch (InputMismatchException e) { // 숫자 이외의 값을 입력 시 예외처리
            System.out.println("숫자만을 입력해 주세요!");
        } catch (IllegalArgumentException e) {
            System.out.println("1 이상의 숫자만 입력해주세요!");
        }
    }
}