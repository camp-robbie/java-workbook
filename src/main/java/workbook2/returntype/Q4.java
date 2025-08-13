package main.java.workbook2.returntype;

import java.util.Scanner;

public class Q4 {
    // TODO: concatStrings 메서드 작성
    // 두 개의 문자열을 입력받아, 두 문자열을 이어붙인 새로운 문자열을 반환하는 메서드를 작성하시오.
    // 반환형은 String이며, 원본 문자열에는 영향을 주지 않습니다.

    public static String concatString(String s1, String s2) {
        return s1 + s2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        // TODO: concatStrings 호출 후 결과 출력
        String result = concatString(s1, s2);

        System.out.println(result);

    }
}