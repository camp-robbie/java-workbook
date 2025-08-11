package main.java.workbook2.methods;

import java.util.Scanner;

public class Q2 {
    // TODO: 문자열 길이를 반환하는 stringLength 메서드 작성
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // TODO: stringLength 호출 후 결과 출력
        System.out.println(stringLength(str));
    }

    public static int stringLength(String str){
        return str.length();
    }
}
