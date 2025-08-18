package main.java.workbook2.methodcompare;

import java.util.Scanner;

// `StringUtil` 클래스에 클래스 메서드 `isPalindrome`을 정의하고, 문자열이 회문인지 여부를 판단하는 프로그램을 작성
// 회문이면 true, 아니면 false를 출력
class StringUtil {
    static boolean isPalindrome(String s) {
        // TODO: 회문 여부 판단
        StringBuffer sb = new StringBuffer(s);      // 매개변수 s를 바탕으로 StringBuffer 객체 생성

        String reverse = sb.reverse().toString();   // StringBuffer 객체의 문자열을 뒤집은 결과를 문자열 타입 reverse에 저장함 (toString()으로 형 변환 필요)

        if(s.equals(reverse)) {                    // sb와 reverse가 같다면 (문자를 뒤집기 전과 후가 동일하다면)
            return true;                           // true를 반환함
        }

        return false;                              // false를 반환함 (굳이 else if로 할 필요 없음)
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       // 스캐너 시작

        String str = sc.next();                    // 문자를 입력받음

        // TODO: StringUtil.isPalindrome 호출 후 출력
        System.out.println(StringUtil.isPalindrome(str));   // 결과를 출력함

        sc.close();                                // 스캐너 닫기
    }
}
