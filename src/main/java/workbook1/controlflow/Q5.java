package main.java.workbook1.controlflow;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int num = sc.nextInt();
            // TODO: 각 자리수의 합을 반복해 한 자리 수가 될 때까지 계산 후 출력
            while (num >= 10) { // num이 두자리 이상이라면 조건 충족되어 반복문 실행
                int sum = 0; // 반복문 안에 sum을 초기화하는 이유는 매번 값을 다시 담아줘야하기 때문에 0으로 초기화

                // 한자리 수까지 계산하는 조건
                while (num > 0) { // 만약 0.8 이런 식으로 값이 남아있다면 반복문 종료
                    sum += num % 10; // num의 맨 뒷자리만 빼내어 sum = sum + num;
                    num /= 10; // 맨 뒷자리 제거 num = num / 10;
                }
                num = sum; // num의 값을 sum의 값으로 덮는다.
            }

            System.out.println(num); // 결과 값 출력
            sc.close(); // 자원 누수 방지
        } catch (InputMismatchException e) {
            System.out.println("숫자만을 입력해 주세요!");
        } catch (IllegalArgumentException e) {
            System.out.println("0 이상의 정수만 입력해주세요!");
        }
    }
}