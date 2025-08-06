package main.java.workbook1.loops;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // TODO: while 문을 이용하여 1부터 n까지의 합 출력
        int i = 1;          // 반복할 변수
        int sum = 0;        // 합계를 저장하기 위한 변수
        while(i <= n) {     // i가 n보다 작거나 같을 때동안 실행됨
            sum += i;       // sum = sum + i; i값을 sum에 더함
            i++;            // i 증가시킴
        }
        System.out.println(sum);    // 결과를 확인하기 위해 출력함
    }
}


