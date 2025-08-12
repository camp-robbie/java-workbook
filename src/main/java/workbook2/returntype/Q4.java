package main.java.workbook2.returntype;

import java.util.Scanner;

public class Q4 {
    // TODO: concatStrings 메서드 작성
    // concatStrings 메서드 (매개변수: String s1, String s2 / 반환 타입: String)
    public static String concatStrings(String s1, String s2) {
        String result = s1 + s2;        // s1 + s2의 결과를 result에 저장함
        return result;                  // result를 반환함
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        // TODO: concatStrings 호출 후 결과 출력
        System.out.println(concatStrings(s1, s2));  // 결과 출력
    }
}