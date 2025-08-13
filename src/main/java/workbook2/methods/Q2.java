package main.java.workbook2.methods;

import java.util.Scanner;

public class Q2 {
    // TODO: 문자열 길이를 반환하는 stringLength 메서드 작성
    public static int stringLength(String str) {
        // length() 메서드는 문자열의 길이를 int로 반환해준다!
        return str.length();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();     // 한 줄 전체 입력 받기 (공백 포함)
        // TODO: stringLength 호출 후 결과 출력

        int stl = stringLength(str); // 메서드 호출

        System.out.println(stl); // 결과 출력

        sc.close();
    }
}
