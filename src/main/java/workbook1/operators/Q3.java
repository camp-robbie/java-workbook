package main.java.workbook1.operators;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 실수를 입력하세요 : ");
        double x = sc.nextDouble();
        System.out.println("두 번째 실수를 입력하세요 : ");
        double y = sc.nextDouble();
        // TODO: x &gt; y 결과와 !(x &gt; y) 결과 출력

        if (!(x < y)) {
            System.out.println("첫 번째 숫자가 더 큽니다.");
        } else {
            System.out.println("두 번째 숫자가 더 큽니다.");
        }
    }
}