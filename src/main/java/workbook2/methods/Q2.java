package main.java.workbook2.methods;

import java.util.Scanner;

public class Q2 {
    // TODO: 문자열 길이를 반환하는 stringLength 메서드 작성
    // 문자열을 입력받아 해당 문자열의 길이를 반환하는 메서드를 작성하고, main에서 호출하여 길이를 출력하는 프로그램을 작성하시오.
    public static int stringLength(String str) {
        return str.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // TODO: stringLength 호출 후 결과 출력
        // 메서드 이름은 stringLength로 하고, 매개변수로 문자열을 받아 int를 반환합니다.
        int length = stringLength(str);
        System.out.println(length);

        sc.close();
    }
}
