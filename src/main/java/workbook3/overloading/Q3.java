package main.java.workbook3.overloading;

import java.util.Scanner;

public class Q3 {
    // TODO: concat 메서드 오버로딩
    static String concat(String s1, String s2){
        return s1+s2;
    }
    static String concat(String s1, String s2, String s3){
        return s1+s2+s3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        // TODO: concat 메서드 작성 후 아래 주석 해제
        System.out.println(concat(s1,s2));
        System.out.println(concat(s1,s2,s3));
    }
}
