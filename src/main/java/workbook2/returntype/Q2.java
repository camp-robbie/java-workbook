package main.java.workbook2.returntype;

import java.util.Scanner;

public class Q2 {
    // TODO: toUpper 메서드 작성 (문자열을 대문자로 반환)
    // 메서드 이름은 toUpper, 매개변수는 String, 반환형은 String입니다.
    public static String toUpper(String str) {
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        // TODO: toUpper 호출 후 결과 출력
        String toUpper = toUpper(str);
        System.out.println(toUpper);
    }
}