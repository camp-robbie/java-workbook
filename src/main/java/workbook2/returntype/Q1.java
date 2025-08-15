package main.java.workbook2.returntype;

import java.util.Scanner;

public class Q1 {       // 기본형 int 반환
    // TODO: add 메서드 작성

    /**
     * add: 두 정수를 더해서 그 합을 '값'으로 반환한다.
     * 반환 타입이 int이므로, 스택에 값 자체가 복사되어 돌아온다.
     */

    public static int add(int a, int b) {
        // 덧셈 결과를 지역 변수에 담았다가 반환해도 되고, 바로 a + b를 반환해도 된다.
        int sum = a + b;
        return sum; // return 뒤의 표현식이 메서드 호출 위치로 "값"을 돌려준다.
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // 예: 4
        int b = sc.nextInt(); // 예: 6
        // TODO: add 호출 후 결과 출력

        // add 메서드 호출 결과(정수)를 반환받아 출력
        int result = add(a, b);
        System.out.println(result); // 10

        sc.close(); // (팁) 콘솔 입력을 닫아 자원 누수 방지
    }
}