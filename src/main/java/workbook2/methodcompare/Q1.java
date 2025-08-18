package main.java.workbook2.methodcompare;

import java.util.Scanner;

// `Calculator` 클래스에 클래스 메서드 `add`와 인스턴스 메서드 `multiply`를 정의하고, 두 메서드를 각각 호출하여 결과를 출력하는 프로그램을 작성
class Calculator {
    // 클래스 메서드 add
    static int add(int a, int b) {
        // TODO: 덧셈 결과 반환
        return a + b;
    }

    // 인스턴스 메서드 multiply
    int multiply(int a, int b) {
        // TODO: 곱셈 결과 반환
        return a * b;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 스캐너 시작

        int x = sc.nextInt();                   // 숫자를 입력받음
        int y = sc.nextInt();                   // 숫자를 입력받음

        int sum = Calculator.add(x, y);         // Calculator 클래스의 클래스 메서드 add를 호출하여 덧셈한 결과를 int형 변수 sum에 저장함

        Calculator calc = new Calculator();     // Calculator 타입의 calc 객체를 생성함 (생성자를 생성하지 않았을 경우, 기본 생성자는 자동으로 만들어짐)

        int prod = calc.multiply(x, y);         // calc 객체의 인스턴스 메서드 multiply를 호출하여 곱셈 결과를 int형 변수 prod에 저장함
        // TODO: sum과 prod 출력
        System.out.println(sum + " " + prod);   // sum과 prod 결과를 출력함

        sc.close();                             // 스캐너 닫기
    }
}
