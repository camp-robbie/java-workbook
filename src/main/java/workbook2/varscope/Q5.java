package main.java.workbook2.varscope;

import java.util.Scanner;

class Calculator {

    // 연산 결과를 저장할 클래스 변수입니다.
    static String history = "";

    // 덧셈을 위한 메서드입니다.
    // 연산 결과를 저장하고 값을 반환합니다.
    int add(int a, int b) {
        // 쉼표를 넣기 위한 조건문입니다.
        // 비어있으면 앞에 쉼표를 넣지 않고,
        // 비어있지 않으면 앞에 쉼표를 넣어 붙입니다.
        if (Calculator.history.isEmpty()){
            Calculator.history = a + " + " + b;
        }else{
            Calculator.history = history + ", " + a + " + " + b;
        }
        return a+b;
    }

    // 뺄셈을 위한 메서드입니다.
    // 연산 결과를 저장하고 값을 반환합니다.
    int sub(int a, int b) {
        // add()와 같이, 비어있지 않을 때 쉼표를 넣기 위한 조건문입니다.
        if (Calculator.history.isEmpty()){
            Calculator.history = a + " - " + b;
        }else{
            Calculator.history = history + ", " + a + " - " + b;
        }
        return a-b;
    }
}

public class Q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Calculator calc = new Calculator();

        int[] results = new int[3];

        for (int i = 0; i < results.length; i++) {
            // 연산자 입력
            String op = sc.next();
            // 연산할 숫자 입력
            int x = sc.nextInt();
            int y = sc.nextInt();

            // 실행 구문
            if (op.equals("add")) {
                results[i] = calc.add(x, y);
            } else {
                results[i] = calc.sub(x, y);
            }
        }

        // 향상된 for 문을 사용해 배열 출력
        for(int i:results){
            System.out.print(i+" ");
        }

        // 개행용 출력문
        System.out.println();

        // 클래스 변수 history 출력
        System.out.println(Calculator.history);
    }
}