package main.java.workbook2.returntype;

import java.util.Scanner;

public class Q4 {
    // 조건 : 반환형은 String, 원본 문자열에 영향을 주지 않을 것.
    public static String concatStrings(String s1, String s2){
        return s1 + s2;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        System.out.println(concatStrings(s1,s2));
    }
}