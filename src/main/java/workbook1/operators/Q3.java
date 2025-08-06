package main.java.workbook1.operators;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        // 기본적으로 비교 연산자는 true || false 값을 반환합니다.
        // 따라서, 출력 코드에서 비교 연산자를 사용함으로 간단히 가능합니다.
        // ! 연산자(논리 NOT 연산자)는 연산의 값을 값을 반전합니다.
        // -> 비트 연산자(~)였을 경우에는 값의 비트가 뒤집히지만, 이 경우에는 논리 연산자입니다.
        // boolean 타입의 값을 반전하는 기능을 합니다.
        System.out.println((x>y)+" "+!(x>y));
    }
}