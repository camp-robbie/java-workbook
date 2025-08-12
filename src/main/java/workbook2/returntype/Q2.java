package main.java.workbook2.returntype;

import java.util.Scanner;

public class Q2 {
    // TODO: toUpper 메서드 작성 (문자열을 대문자로 반환)
    public static String toUpper (String str) {          // toUpper 메서드 -> 매개변수 문자열 str을 받아 대문자 변환 후 반환
         return str.toUpperCase();                       // String 타입인 str을 대문자로 변환하여 반환
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);             // Scanner 생성
        String str = sc.next();                          // 공백/개행으로 구분된 문자열 1개 읽기

        // TODO: toUpper 호출 후 결과 출력
        String result = toUpper(str);                    // toUpper 메서드 호출하여 변수 result에 저장

        System.out.println(result);                      // result 출력

        sc.close();                                      // 입력 닫기
    }
}