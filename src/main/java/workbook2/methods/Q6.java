package main.java.workbook2.methods;

import java.util.Scanner;

public class Q6 {
    // TODO: 재귀를 이용한 factorial 메서드 작성
    public static int factorial(int n){
        if (n <= 1){                       // 조건 : 1 이하 -> 1 반환
            return 1;
        }
        return n * factorial(n-1);      // 조건 : 1 초과 -> n * factorial(n-1) 반환 => 재귀 호출
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();              // 정수 n 입력 받기
        // TODO: factorial 호출 후 결과 출력

        System.out.println(factorial(n));  // factorial 메서드 호출 및 결과 출력

        sc.close();
    }
}
