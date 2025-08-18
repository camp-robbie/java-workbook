package main.java.workbook2.methodcompare;

import java.util.Scanner;

class Calculator {                     // 클래스 정의

    static int add(int a, int b) {     // 덧셈 결과 반환하는 클래스 메서드 정의(정적 메서드)
                                       // -> 인스턴스 없이 Calculator.add(x,y)로 호출
                                       // -> 인스턴스 필드/메서드에 직접 접근 불가
        // TODO: 덧셈 결과 반환
        return (a + b);
    }

    int multiply(int a, int b) {        // 곱셈 결과 반환하는 인스턴스 메서드 정의
        // TODO: 곱셈 결과 반환
        return (a * b);
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // Scanner 생성

        int x = sc.nextInt();                   // 첫 번째 정수 1개 읽어 x에 저장
        int y = sc.nextInt();                   // 두 번째 정수 1개 읽어 y에 저장
        int sum = Calculator.add(x, y);         // Calculator 클래스의 add(x, y)메서드 호출하여 반환값을 sum에 저장

        Calculator calc = new Calculator();     // 새로운 객체 Calculator() 생성하여, 참조를 calc에 저장

        int prod = calc.multiply(x, y);         // calc가 참조하는 multiply(x, y)메서드 호출하여 반환값을 prod에 저장
        // TODO: sum과 prod 출력
        System.out.println(sum + " " + prod);   // sum 값과 prod 값 출력 (공백으로 구분)

        sc.close();                             // 입력 닫기
    }
}
