package main.java.workbook2.varscope;

import java.util.Scanner;

class Calculator {

    static String history = "";

    int add(int a, int b) {
        // TODO: 연산 결과 저장 후 반환
        int result = a + b;
        // 기록 형식: "1 + 2, 5 - 3, 4 + 6"
        appendHistory(a + " + " + b);
        return result;

        ///  이지호님 풀이 참고                 // +, -  기호 하나 때문에 메서드가 반복되서 불편해서 찾아보니,
//        int result = a + b;
//        if (!history.isEmpty()) {
//            history += ", ";
//        }
//        history += a + " + " + b;          // ← 같은 패턴을 sub에도 또 써야 함 (중복)
//        return result;
    }

    int sub(int a, int b) {
        // TODO: 연산 결과 저장 후 반환
        int result = a - b;
        appendHistory(a + " - " + b);
        return result;

        /// 이지호님 풀이 참고
//        int result = a - b;
//        if (!history.isEmpty()) {
//            history += ", ";
//        }
//        history += a + " - " + b;         // ← 여기서도 동일 코드 반복
//        return result;
    }

    private void appendHistory(String expr) {
        if (!history.isEmpty()) {
            history += ", ";
        }
        history += expr;

        /**
         * // history가 비어있지 않으면 앞에 ", " 붙이고
         * if (!history.isEmpty()
         * ) {
         * history += ", ";
         * }
         * // 표현식(expr)을 덧붙입니다.
         * history += "표현식";
         */

        /**
         * 작동 순서
         * 첫 기록: history = "" → 쉼표 안 붙음 → "1 + 2"
         *
         * 두 번째 기록 이후: 쉼표 붙음 → "1 + 2, 5 - 3, 4 + 6"
         */
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
    }
}