package main.java.workbook2.methods;

import java.util.Scanner;

public class Q1 {
    // TODO: 두 정수를 더해 반환하는 sum 메서드를 작성하세요.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 숫자를 입력하세요.");
        int a = sc.nextInt();
        System.out.println("두 번째 숫자를 입력하세요.");
        int b = sc.nextInt();
        // TODO: sum 메서드를 호출하여 결과 출력

        int sum = a + b;
        System.out.println(sum);
    }
}
