package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // TODO: a, b, c 중 최대값 또는 같은 값 여부 출력

        // a, b, c 중에 같은 수가 존재하면
        if (a == b || b == c || a == c) { // a, b, c 중에 같은 수가 존재 한다면
            System.out.println("같은 수 존재");
        } else {                    // 같은 수가 존재하지 않는다면
            if (a > b) {                    // a가 b보다 클 경우
                if (a > c) {                // a가 c보다 클 경우
                    System.out.println(a);  /// a를 출력함
                } else {                    // c가 a보다 크다면
                    System.out.println(c);  /// c를 출력함
                }
            } else {                        // b가 a보다 크다면
                if (b > c) {                // b가 c보다 크다면
                    System.out.println(b);  /// b를 출력함
                } else {                    // b보다 c가 크다면
                    System.out.println(c);  /// c를 출력함
                }
            }
        }
        sc.close(); // sc 객체 종료
    }
}