package main.java.workbook3.overloading;

import java.util.Scanner;

public class Q1 {
    // TODO: printValue 오버로딩 (int), (double), (String)
    static int printValue(int i){
        return i;
    }
    static double printValue(double d){
        return d;
    }
    static String printValue(String s){
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        double d = sc.nextDouble();
        String s = sc.next();
        // TODO: printValue (int), (double), (String) 메서드 작성 후 아래 주석 해제
        System.out.println(printValue(i));
        System.out.println(printValue(d));
        System.out.println(printValue(s));
    }
}
