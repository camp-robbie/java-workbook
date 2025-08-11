package main.java.workbook2.methods;

import java.util.Scanner;

public class Q6 {
    // TODO: 재귀를 이용한 factorial 메서드 작성
    public static long factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("팩토리얼을 계산할 숫자를 입력하세요.");
        int n = sc.nextInt();
        // TODO: factorial 호출 후 결과 출력

        if (n < 0) {
            System.out.println("음수는 팩토리얼을 계산할 수 없습니다.");
        } else {
            long result = factorial(n);
            System.out.println(n + "! = " + result);
        }

        sc.close();
    }
}
