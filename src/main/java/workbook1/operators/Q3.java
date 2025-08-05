package main.java.workbook1.operators;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        // TODO: x &gt; y 결과와 !(x &gt; y) 결과 출력
        boolean result = x > y;     // x가 y보다 크면 true를 반환하고, x가 y보다 작으면 false를 반환하는 boolean형 변수

        boolean reverseResult = !result;    // NOT 연산 결과를 확인하기 위한 변수. result의 반대 결과를 반환함

        System.out.println(result + " " + reverseResult);   // 결과를 확인하기 위해서 출력함

    }
}