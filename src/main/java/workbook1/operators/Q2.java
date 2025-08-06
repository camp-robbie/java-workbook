package main.java.workbook1.operators;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        // TODO: 전위 증가와 후위 증가 결과 출력
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(++num); // 전위증가
        System.out.println(num++); // 후위증가
        // 순서에 따라 갈림
    }
}
