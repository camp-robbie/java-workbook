package main.java.workbook1.operators;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        // 두 개의 정수를 입력받아 산술 연산자를 모두 적용한 결과를 한 줄에 출력합니다.
        // 한 줄에 출력하고, 사이에 띄어쓰기를 주어 값을 구분하기 위해 String 값과의
        // 연산을 실행하여, 연산 이후에는 String 값으로 처리되게끔 했습니다.
        System.out.println((a+b)+" "+(a-b)+" "+(a*b)+" "+(a/b)+" "+(a%b));
    }
}