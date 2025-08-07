package main.java.workbook2.methods;

import java.util.Scanner;

public class Q6 {
    // TODO: 재귀를 이용한 factorial 메서드 작성
    public static int factorial(int n){
        if(n <= 1){
            return 1;
        }
        return n * factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // TODO: factorial 호출 후 결과 출력
        int factorial = factorial(n);
        System.out.println(factorial);
        sc.close();
    }
}
