package main.java.workbook2.returntype;

import java.util.Scanner;

public class Q2 {       // 참조형 String 반환
    // TODO: toUpper 메서드 작성 (문자열을 대문자로 반환)

    /**
     * toUpper: 전달받은 문자열을 '새 문자열'로 변환해 반환한다.
     * String은 '참조형'이라 반환 시 객체의 '주소(참조)'가 반환된다.
     * String은 불변(immutable)이므로 원본 str은 바뀌지 않고,
     * 대문자로 변환된 '새 String' 객체의 참조가 반환된다.
     */
    public static String toUpper(String str) {
        // String 클래스의 내장 메서드 toUpperCase() 사용
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();     // 예: java
        // TODO: toUpper 호출 후 결과 출력

        String upper = toUpper(str);
        System.out.println(upper); // JAVA

        sc.close();
    }
}