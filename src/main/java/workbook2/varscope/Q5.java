package main.java.workbook2.varscope;

import java.util.InputMismatchException;
import java.util.Scanner;

class Calculator {
    static String history = "";

    int add(int a, int b) {
        // TODO: 연산 결과 저장 후 반환
        int sum = a + b; // 덧셈 연산 구현
        if (!history.isEmpty()) { // 만약 history가 비어있지 않다면
            history += ", "; // 이것을 추가한다.
        }
        history += a + " + " + b; // 연산식을 history에 저장한다.
        return sum; // 연산 값을 return한다.
    }

    int sub(int a, int b) {
        // TODO: 연산 결과 저장 후 반환
        int sub = a - b; // 뺄셈 연산 구현
        if (!history.isEmpty()) { // 만약 history가 비어있지 않다면
            history += ", "; // 이것을 추가한다.
        }
        history += a + " - " + b; // 연산식을 history에 저장한다.
        return sub; // 연산 값을 return한다.
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            Calculator calc = new Calculator();

            int[] results = new int[3];

            for (int i = 0; i < 3; i++) {
                String op = sc.next();
                int x = sc.nextInt();
                int y = sc.nextInt();

                if (op.equals("add")) { // 입력 값이 add라면
                    results[i] = calc.add(x, y); // Calculator 클래스의 add 메서드 호출
                } else { // 입력 값이 add가 아니라면
                    results[i] = calc.sub(x, y); // Calculator 클래스의 sub 메서드 호출
                }
            }

            // TODO: results 배열과 Calculator.history 출력
            for (int i = 0; i < 3; i++) { // results 배열 전체 출력
                System.out.print(results[i] + " ");
            }
            System.out.println("\n"+calc.history); // 저장된 history 값 출력
        } catch (InputMismatchException e) { // 숫자가 아닌 값을 입력 시
            System.out.println("숫자만 입력해 주세요!"); // 예외 처리
        } finally{ // 항상 실행
            sc.close(); // 자원 누수 방지
        }
    }
}