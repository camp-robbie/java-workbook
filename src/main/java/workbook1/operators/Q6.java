package main.java.workbook1.operators;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        //x와 y 중 큰 값에 5를 곱하기(삼항연산자 사용)
        int result = (x>y) ? x*5 : y*5 ;
        //출력
        System.out.println(result);
    }
}