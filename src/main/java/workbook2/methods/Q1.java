package main.java.workbook2.methods;

import java.util.Scanner;

public class Q1 {       // 두 정수 합 sum
    // TODO: 두 정수를 더해 반환하는 sum 메서드를 작성하세요.

    /**
     * 메서드 선언부
     * - 이름: sum
     * - 매개변수(Parameter): int x, int y (호출 시 넘겨 받을 값의 그릇)
     * - 반환형(Return type): int (계산 결과의 타입)
     * - 기능: 두 정수를 더한 결과를 반환한다.
     */

    public static int sum(int x, int y) {
        // 구현부(Body): 실제 작업을 적는 곳
        return x + y; // return: 메서드 실행을 종료하고 호출한 곳으로 값을 돌려줌
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 예시: "3 5"
        int a = sc.nextInt(); // 첫 번째 정수 입력
        int b = sc.nextInt(); // 두 번째 정수 입력

        // TODO: sum 메서드를 호출하여 결과 출력

        // 메서드 호출(Call): 준비한 매개변수 자리에 실제 값을 넣어 호출
        int result = sum(a, b);

        // 결과 출력
        System.out.println(result);

        sc.close(); // 자원 정리(초보 단계에서도 습관화하기)
    }
}
