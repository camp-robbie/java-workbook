package main.java.workbook2.methods;

import java.util.Scanner;

public class Q2 {
    // TODO: 문자열 길이를 반환하는 stringLength 메서드 작성
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("문자열을 입력하세요 : ");
        String str = sc.nextLine();
        // TODO: stringLength 호출 후 결과 출력
        int stringLength = str.length();
        System.out.println("stringLength : " + stringLength);
    }
}
