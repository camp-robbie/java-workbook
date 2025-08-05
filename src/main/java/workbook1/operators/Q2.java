package main.java.workbook1.operators;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // TODO: 전위 증가와 후위 증가 결과 출력

        // 전위 증가
        int pre = ++num;
        // 후위 증가
        int post = num++;

        // 출력
        System.out.println(pre + " " + post);

        // 후위 증가 확인용
        // System.out.println(num);
    }
}
