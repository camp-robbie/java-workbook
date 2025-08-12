package main.java.workbook2.methods;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(factorial(n));
    }
    // 재귀를 사용하여 n! 을 출력합니다.
    // 정수가 1 이하가 되면 1을 반환합니다.
    static int factorial(int n){
        if (n<=1){
            return 1;
        }else {
            // 이 메서드 안에서 똑같은 메서드를 호출합니다! (재귀)
            // ((1*2)*3)...*n 과 같은 형태로 작동합니다.
            return n * factorial(n-1);
        }
    }
}
