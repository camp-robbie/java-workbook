package main.java.workbook2.methods;

import java.util.Scanner;

public class Q6 {
    // TODO: 재귀를 이용한 factorial 메서드 작성
    // 재귀를 사용하여 정수 n의 팩토리얼을 계산하는 메서드 factorial을 작성하고, 입력받은 n에 대해 결과를 출력하는 프로그램을 작성하시오.
    // factorial 메서드는 정수가 1 이하가 되면 1을 반환합니다.

    // 재귀(recursion) : 어떤 함수가 자기 자신을 다시 호출하는 방식
    // 팩토리얼(factorial) : 1부터 어떤 숫자까지 모두 곱한 값
    // n의 팩토리얼을 factorial(n)으로 코드 구현
    public static long factorial(int n) {
        // factorial 메서드는 정수가 1 이하가 되면 1을 반환합니다.
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1); // 재귀 호출
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // TODO: factorial 호출 후 결과 출력
        long result = factorial(n);
        System.out.println(result);
    }
}
