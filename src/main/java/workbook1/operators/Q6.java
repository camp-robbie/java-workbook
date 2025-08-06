package main.java.workbook1.operators;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        // 삼항 연산자의 구조는 아래와 같습니다.
        // (조건) ? (참일때 구문) : (거짓일때 구문)
        // x가 y보다 크다면 x*5를,
        // 아니라면 y*5 를 반환하고, sout은 이를 출력합니다.
        System.out.println((x>y) ? x*5 : y*5);
    }
}