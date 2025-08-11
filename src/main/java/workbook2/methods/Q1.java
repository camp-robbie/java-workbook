package main.java.workbook2.methods;

import java.util.Scanner;

public class Q1 {
    // TODO: 두 정수를 더해 반환하는 sum 메서드를 작성하세요.
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // TODO: sum 메서드를 호출하여 결과 출력

        Q1 q1 = new Q1();

        int result = q1.sum(a, b);
        System.out.println(result);
        // 한번에
//        System.out.println(q1.sum(a, b));

        sc.close();

    }
}
