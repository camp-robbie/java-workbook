package main.java.workbook3.overloading;

import java.util.Scanner;

public class Q2 {
    // TODO: max 메서드 오버로딩 (int,int)와 (int,int,int)
    static int max(int a, int b){
        return a > b ? a : b;
    }

    static int max(int a, int b, int c){
        return max(a, max(b, c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // TODO: max 메서드 작성 후 아래 주석 해제
         System.out.println(max(a,b));
         System.out.println(max(a,b,c));
    }
}