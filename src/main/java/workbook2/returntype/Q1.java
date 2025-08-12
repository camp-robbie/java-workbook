package main.java.workbook2.returntype;

import java.util.Scanner;

public class Q1 {
    // TODO: add 메서드 작성
    public static int add(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // TODO: add 호출 후 결과 출력
        System.out.println(add(a,b));
    }
}