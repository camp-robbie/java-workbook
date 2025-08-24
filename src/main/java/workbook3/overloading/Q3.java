package main.java.workbook3.overloading;

import java.util.Scanner;

public class Q3 {
    // TODO: concat 메서드 오버로딩
    // concat 메서드 오버로딩 (String, String)
    public static String concat(String s1, String s2) {
        return s1 + s2;         // s1과 s2를 이어 붙인 후, 반환함
    }

    // concat 메서드 오버로딩 (String, String, String)
    public static String concat(String s1, String s2, String s3) {
        return s1 + s2 + s3;    // s1과 s2, s3를 이어 붙인 후, 반환함
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);            // 스캐너 열기
        String s1 = sc.next();                          // s1의 값을 입력받음
        String s2 = sc.next();                          // s2의 값을 입력받음
        String s3 = sc.next();                          // s3의 값을 입력받음

        // TODO: concat 메서드 작성 후 아래 주석 해제
         System.out.println(concat(s1,s2));             // concat(s1,s2)의 결과를 출력함
         System.out.println(concat(s1,s2,s3));          // concat(s1,s2,s3)의 결과를 출력함
    }
}
