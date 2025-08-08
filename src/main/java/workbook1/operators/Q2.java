package main.java.workbook1.operators;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(++num);
        System.out.print(" " + num++);
        // TODO: 전위 증가와 후위 증가 결과 출력
    }
}
