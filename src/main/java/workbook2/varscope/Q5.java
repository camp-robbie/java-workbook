package main.java.workbook2.varscope;

import java.util.Scanner;

class Calculator {
    static String history = "";
    int add(int a, int b) {
        // TODO: 연산 결과 저장 후 반환
        int result = a + b;
        if (!history.isEmpty()) {
            history += ", ";
        }
        history += a + " + " + b;
        return result;
    }
    int sub(int a, int b) {
        // TODO: 연산 결과 저장 후 반환
        int result = a - b;
        if (!history.isEmpty()) {
            history += ", ";
        }
        history += a + " - " + b;
        return result;
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
        System.out.println(results[0] + " " + results[1] + " " + results[2]);
        System.out.println(Calculator.history);
        sc.close();
    }
}