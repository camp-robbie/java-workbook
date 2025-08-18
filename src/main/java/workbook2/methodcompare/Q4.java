package main.java.workbook2.methodcompare;

import java.util.Scanner;

class StringUtil {                                // 클래스 정의

    static boolean isPalindrome(String s) {       // 클래스 정적 메서드 정의
        // TODO: 회문 여부 판단
        int i = 0, j = s.length() - 1;            // i=0, j=마지막 요소 선언
        while (i < j) {                           // i < j 일 때까지 반복문 수행
            if (s.charAt(i++) != s.charAt(j--))   // 만약 i와 j가 다르다면 (i= 후위증가 / j= 후위감소)
                return false;                     // false 를 반환
        }
        return true;                              // 그 외에는 true 반환
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                  // Scanner 생성
        String str = sc.next();                               // 공백으로 구분된 첫 문자열 1개 읽어 str 에 저장

        // TODO: StringUtil.isPalindrome 호출 후 출력
        System.out.println(StringUtil.isPalindrome(str));     // StringUtil 클래스의 isPalindrome(str) 메서드 호출하여 반환값 출력

        sc.close();                                           // 입력 닫기
    }
}

/*
    회문 => 가운데를 기준으로 좌우가 대칭!
 */