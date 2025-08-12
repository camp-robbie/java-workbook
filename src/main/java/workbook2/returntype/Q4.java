package main.java.workbook2.returntype;

import java.util.Scanner;

public class Q4 {
    // TODO: concatStrings 메서드 작성
    public static String concatStrings(String str1, String str2) { // 매개변수 str1, str2를 받아 문자열을 이어 붙여주는 concatStrings 메서드
        return str1 + str2;                                        // 문자열 이어 붙여서 반환
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                       // Scanner 생성
        String s1 = sc.next();                                     // 공백/개행 전까지 첫 번째 문자열 입력 받아 s1에 저장
        String s2 = sc.next();                                     // 다음 두 번째 문자열 입력 받아 s2에 저장

        // TODO: concatStrings 호출 후 결과 출력
        String result = concatStrings(s1, s2);                     // concatStrings 메서드 호출하여 변수 result에 대입

        System.out.println(result);                                // result 값 출력

        sc.close();                                                // 입력 닫기
    }
}