package main.java.workbook2.methodcompare;

import java.util.Scanner;

class StringUtil {
    // 클래스 메서드 isPalindrome() 입니다.
    // 회문(반대로 읽어도 똑같은지 아닌지) 판단하여 True or False 로 return 합니다.
    static boolean isPalindrome(String s) {
        StringBuffer sb = new StringBuffer(s);
        // contentEquals()
        // -> CharSequence 인터페이스를 구현한 객체와 String을 비교함.
        // 즉, 입력된 값 String s와
        // 이 s를 뒤집은 (reverse()) StringBuffer sb의 값이 같다면
        // true 를 return 하고, 같지 않다면 false를 return 함.
        // contentEquals() 의 기본 return 이 boolean 값이기 때문에,
        // 그대로 return 해주어도 됩니다.
        return s.contentEquals(sb.reverse());
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        // isPalindrome 은 클래스 메서드로, 객체를 생성하지 않아도 사용할 수 있습니다.
        System.out.println(StringUtil.isPalindrome(str));
    }
}
