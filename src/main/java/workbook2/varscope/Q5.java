package main.java.workbook2.varscope;

import java.util.Scanner;

class Calculator {
    static String history = "";                       // 클래스 변수 history 선언 -> 모든 인스턴스가 공유
                                                      // => 클래스 최초 1회만 초기화 시 ""로 설정

    int add(int a, int b) {                           // add 메서드
        // TODO: 연산 결과 저장 후 반환
        int result = a + b;                           // a , b 합을 result에 저장
        if (!Calculator.history.isEmpty()) {          // 만약 history가 비어있지 않다면 ", " 추가
            Calculator.history += ", ";               // (첫 항목 제외하고 앞에 ", " 추가)
        }
        Calculator.history += a + " + " + b ;         // Calculator의 변수 history에 "a + b"값 저장
        return result;                                // result 반환
    }
    int sub(int a, int b) {                           // sub 메서드
        // TODO: 연산 결과 저장 후 반환
        int result = a - b;                           // a , b 차를 result에 저장
        if (!Calculator.history.isEmpty()) {          // 만약 history가 비어있지 않다면 ", " 추가
            Calculator.history += ", ";               // (첫 항목 제외하고 앞에 ", " 추가)
        }
        Calculator.history += a + " - " + b ;         // Calculator의 변수 history "a - b"값 저장
        return result;                                // result 반환
    }
}

public class Q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);          // Scanner 생성

        Calculator calc = new Calculator();           // 새로운 객체 Calculator() 생성하여, 참조를 calc에 저장
        int[] results = new int[3];                   // 길이가 3인 정수형 배열 객체 생성하여, 참조를 results에 저장

        for (int i = 0; i < 3; i++) {                 // i=0부터 3(배열길이) 미만까지 i가 1씩 증가하며 for문 반복
            String op = sc.next();                    // 개행/공백 전까지 문자열 1개 읽어 op에 저장
            int x = sc.nextInt();                     // 다음 숫자 1개 읽어 x에 저장
            int y = sc.nextInt();                     // 다음 숫자 1개 읽어 y에 저장
            if (op.equals("add")) {                   // op의 값이 "add"와 같다면
                results[i] = calc.add(x, y);          // calc가 참조하는 add 메서드 호출하여 results 배열에 저장
            } else if (op.equals("sub")) {            // op의 값이 "sub"와 같다면
                results[i] = calc.sub(x, y);          // calc가 참조하는 sub 메서드 호출하여 results 배열에 저장
            }
        }
        // TODO: results 배열과 Calculator.history 출력
        for (int i = 0; i < 3; i++) {                 // i=0부터 3(배열길이) 미만까지  -> results 배열 전체 출력
            if (i < 2) {                              // i가 2보다 작다면
                System.out.print(results[i] + " ");   // 항목 + 공백 출력   => 공백으로 구분 (마지막 공백 제외)
            } else {                                  // i가 마지막 요소면
                System.out.println(results[i]);       // 항목만 출력
            }
        }
        System.out.print(Calculator.history);         // Calculator 클래스의 변수 history 출력

    }
}