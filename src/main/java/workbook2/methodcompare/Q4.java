package main.java.workbook2.methodcompare;

import java.util.Scanner;

class StringUtil {
    static boolean isPalindrome(String s) {
        // TODO: 회문 여부 판단
        StringBuilder sb = new StringBuilder(s);        //문자열 뒤집는 기능 사용하기 위해 StringBuilder객체 생성
        if(sb.reverse().toString().equals(s)){
            return true;
        }else{
            return false;
        }
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // TODO: StringUtil.isPalindrome 호출 후 출력
        System.out.println(StringUtil.isPalindrome(str));
    }
}
