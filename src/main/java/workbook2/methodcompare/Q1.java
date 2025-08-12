package main.java.workbook2.methodcompare;

import java.util.Scanner;

class Calculator {
    // 객체 없이 호출할 수 있는 클래스 메서드(static method) add 입니다.
    static int add(int a, int b) {
        return a+b;
    }
    // 객체가 생성되면 호출할 수 있는 인스턴스 메서드 multiply 입니다.
    int multiply(int a, int b) {
        return a*b;
    }
}

public class Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        // add()는 클래스 메서드로, 객체를 생성하지 않아도 사용할 수 있습니다.
        int sum = Calculator.add(x, y);

        // .multiply() 를 사용하기 위해 객체를 생성합니다.
        Calculator calc = new Calculator();

        // 객체명.multiply() 임을 알 수 있습니다.
        int prod = calc.multiply(x, y);

        // 출력합니다.
        System.out.println(sum+" "+prod);
    }
}
