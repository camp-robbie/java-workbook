package main.java.workbook1.loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int n = sc.nextInt(); // 입력 값을 유저에게 받는다.
            int sum = 0; // 결과 값을 더할 변수 설정
            int count = 0; // 반복문에서 카운트 해줄 변수
            // TODO: do-while 문으로 3의 배수의 합 계산 후 출력

            if (n < 0) { // 음수를 입력 시 예외 처리
                throw new IllegalArgumentException();
            }

            do {
                if (count % 3 == 0) { // 만약 count가 3의 배수라면
                    sum += count; // sum = sum + count;
                }
                count++; // 반복할 때마다 1씩 증가
            } while (count <= n); // 반복한 횟수가 입력 값 이상이 될 때 반복문을 종료

            System.out.println(sum); // 결과 값 출력
        } catch (InputMismatchException e) { // 숫자 이외의 입력 값을 받을 시 예외처리
            System.out.println("숫자만을 입력해주세요!");
        } catch (IllegalArgumentException e) { // 조건문에서 발생 시키 예외를 잡아서 예외처리
            System.out.println("음수는 입력하실 수 없습니다.");
        }
    }
}
