package main.java.workbook2.returntype;

import java.util.Scanner;

public class Q4 {       // 두 문자열 이어붙여 새 String 반환
    // TODO: concatStrings 메서드 작성

    /**
     * concatStrings: s1과 s2를 이어붙인 '새 문자열'을 만들어 반환
     * String은 불변이라 s1, s2 원본에는 영향이 없다.
     */

    public static String concatStrings(String s1, String s2) {
        return s1 + s2; // "Hello" + "World" => "HelloWorld"
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next(); // 예: Hello
        String s2 = sc.next(); // 예: World
        // TODO: concatStrings 호출 후 결과 출력

        String result = concatStrings(s1, s2);
        System.out.println(result); // HelloWorld

        sc.close();
    }
}