package main.java.workbook1.operators;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        boolean result = x > y; // 논리 연산 후 결과를 true or false로 출력
        System.out.println(result + " " + !result); // !not 연산자를 활용하여 다시 비교 값을 출력
    }
}