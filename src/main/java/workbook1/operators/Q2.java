package main.java.workbook1.operators;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // TODO: 전위 증가와 후위 증가 결과 출력

        // 5를 입력했다고 가정했을 때.
        int back = num++;
        // 후위 연산자
        // back에 먼저 숫자를 저장 후 그 다음 num이 1 증가됨
        // 그렇기 때문에 back에는 5라는 숫자가 저장되고 num에는 6이라는 숫자가 저장됨
        System.out.println("num: " + num);
        System.out.println("back = " + back);

        int front = ++num;
        // 전위 연산자
        // 앞서 후위 연산자에서 num이 6으로 저장됐다.
        // 따라서 num에 1을 먼저 더해 7로 만든 후 그 결과를 front에 저장한다.

        System.out.println("num: " + num);
        System.out.println("front = " + front);

    }
}
