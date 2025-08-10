package main.java.workbook2.methods;

import java.util.Scanner;

public class Q2 {
    // TODO: 문자열 길이를 반환하는 stringLength 메서드 작성
    public int stringLength(String str) {
        return str.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // TODO: stringLength 호출 후 결과 출력

        Q2 q2 = new Q2();

        System.out.println(q2.stringLength(str));

        sc.close();

    }
}
