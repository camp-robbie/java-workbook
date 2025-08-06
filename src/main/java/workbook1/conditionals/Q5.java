package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // TODO: a, b, c 중 최대값 또는 같은 값 여부 출력

        // 삼항 연산자를 활용한 문제 풀이
        if (a == b && b == c) {
            System.out.println("같은 수 존재");
        } else int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println(max);

        // Math.max() 함수를 이용한 활용 풀이

        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int c2 = sc.nextInt();

        if (a2 == b2 && b2 == c2) {
            System.out.println("같음");
        } else {
            // Math.max()로 두 번 비교
            int max = Math.max(a2, Math.max(b2, c2));
            System.out.println("최대값: " + max);
        }
    }
}
