package main.java.workbook2.methods;

import java.util.Scanner;

public class Q1 {
    // TODO: 두 정수를 더해 반환하는 sum 메서드를 작성하세요.
    public static int sum(int x, int y) {
        return x + y; // x와 y를 더한 결과 반환
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // TODO: sum 메서드를 호출하여 결과 출력

        // sum 메서드 호출 → a, b 값을 전달
        int result = sum(a, b); // 결과를 result에 합 저장

        // 결과 출력
        System.out.println(result);

        sc.close();
    }
}
