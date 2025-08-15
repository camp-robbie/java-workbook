package main.java.workbook2.methods;

import java.util.Scanner;

public class Q6 {       // 재귀 팩토리얼 factorial
    // TODO: 재귀를 이용한 factorial 메서드 작성

    /**
     * 메서드 이름: factorial
     * 매개변수: int n
     * 반환형: long (값이 빠르게 커지므로 int보다 넉넉하게 long 사용)
     * 재귀 베이스(Base) 조건: n <= 1이면 1 반환 (문제 조건)
     * 재귀 관계: n! = n * (n-1)!
     */

    public static long factorial(int n) {
        if (n <= 1) {           // 베이스 조건: 1! = 1, 0! = 1
            return 1L;
        }
        // 재귀 호출: 자기 자신을 더 작은 문제로 호출
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // 예시 입력: 5
        // TODO: factorial 호출 후 결과 출력

        long result = factorial(n);
        System.out.println(result); // 예시 출력: 120

        sc.close();
    }
}
