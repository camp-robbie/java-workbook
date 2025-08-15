package main.java.workbook2.varscope;

import java.util.Scanner;

class Calculator {
    static String history = "";
    int add(int a, int b) {
        // TODO: 연산 결과 저장 후 반환
        history = history + a + " + " + b + ", ";
        return a + b;
    }
    int sub(int a, int b) {
        // TODO: 연산 결과 저장 후 반환
        history = history + a + " - " + b + ", ";
        return a - b;
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        int[] results = new int[3];
        for (int i = 0; i < 3; i++) {
            String op = sc.next();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (op.equals("add")) {
                results[i] = calc.add(x, y);
            } else {
                results[i] = calc.sub(x, y);
            }
        }
        // TODO: results 배열과 Calculator.history 출력
        for (int result : results) {            // 향상된 for문
            System.out.print(result + " ");     // results 배열 출력
        }

        System.out.println();   // 띄어쓰기 추가

        System.out.println(Calculator.history); // Calculator.history 출력

        // 마지막 , 제거는 어떻게 할까?
    }
}