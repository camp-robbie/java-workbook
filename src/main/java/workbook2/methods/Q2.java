package main.java.workbook2.methods;

import java.util.Scanner;

public class Q2 {       // 문자열 길이 stringLength
    // TODO: 문자열 길이를 반환하는 stringLength 메서드 작성

    /**
     * 메서드 이름: stringLength
     * 매개변수: String s (길이를 알고 싶은 문자열)
     * 반환형: int (문자열의 길이)
     */

    public static int stringLength(String s) {
        // String.length()는 문자열의 문자 개수를 반환
        return s.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 공백 포함 한 줄 전체를 입력받으려면 nextLine() 사용
        String str = sc.nextLine();
        // TODO: stringLength 호출 후 결과 출력

        int len = stringLength(str);
        System.out.println(len);

        sc.close();
    }
}
