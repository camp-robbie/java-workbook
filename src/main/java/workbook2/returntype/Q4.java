package main.java.workbook2.returntype;

import java.util.Scanner;

public class Q4 {
    /*
    static 으로 concatString 메서드를 메모리에 올린 후 입력받은 문자열을 합친 후 출력한다.
     */
    // TODO: concatStrings 메서드 작성
    public static String concatStrings(String s1, String s2) {
        return s1 + s2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String s1 = sc.next();
            String s2 = sc.next();

            // TODO: concatStrings 호출 후 결과 출력
            String str = concatStrings(s1, s2);

            System.out.println(str);
        } finally { // 항상 실행
            sc.close(); // 자원 누수 방지
        }
    }
}