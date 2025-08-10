package main.java.workbook2.methods;

import java.util.Scanner;

public class Q6 {
    // TODO: 재귀를 이용한 factorial 메서드 작성
    // factorial 메서드는 정수가 1 이하가 되면 1을 반환
    public static int factorial(int n) {
        if(n <= 1) {    // 1 이하가 되면
            return 1;   // 1을 반환
        }
        return n * factorial(n-1);  // 재귀
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // TODO: factorial 호출 후 결과 출력
        System.out.println(factorial(n));   // 호출 후 결과 출력
    }
}
