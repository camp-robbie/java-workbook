package main.java.workbook2.returntype;

import java.util.Scanner;

public class Q2 {
    // 조건
    // 메서드 이름 : toUpper, 매개변수와 반환형은 String
    public static String toUpper(String str){
        // (String).toUpperCase() 를 사용하여 내부 문자들을 대문자로 변환할 수 있습니다.
        return str.toUpperCase();
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        // 메서드를 호출하며 출력합니다.
        System.out.println(toUpper(str));
    }
}