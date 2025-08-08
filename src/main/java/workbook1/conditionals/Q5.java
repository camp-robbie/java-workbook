package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세요.");
        int a = sc.nextInt();
        System.out.println("두 번째 숫자를 입력하세요.");
        int b = sc.nextInt();
        System.out.println("세 번째 숫자를 입력하세요.");
        int c = sc.nextInt();
        // TODO: a, b, c 중 최대값 또는 같은 값 여부 출력

        if (b < a && a > c) {
            System.out.println(a + "첫 번째 숫자가 가장 큽니다. ");
        } else if (a < b && b > c) {
            System.out.println(b + "두 번째 숫자가 가장 큽니다. ");
        } else if (b < c && c > a) {
            System.out.println(c + "세 번째 숫자가 가장 큽니다. ");
        } else if (a == b || b == c || c == a) {
            System.out.println("같은 수가 존재합니다.");
        } else {
            System.out.println("숫자를 입력하세요 휴먼..");
        }
    }
}