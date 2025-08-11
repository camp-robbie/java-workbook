package main.java.workbook2.methods;

import java.util.Scanner;

public class Q2 {
    // TODO: 문자열 길이를 반환하는 stringLength 메서드 작성
    // 문자열 길이를 반환 = int
    public int stringLength(String word) { // String 타입의 매개변수 word를 받는다
        return word.length(); // str.length() 메서드를 사용하여 문자열의 길이를 계산
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            String str = sc.nextLine(); // 문자열 입력

            // TODO: stringLength 호출 후 결과 출력
            Q2 length = new Q2(); // 객체 생성
            System.out.println(length.stringLength(str)); // 객체를 통해 메서드를 호출(입력 값)한다.
        } finally{ // 항상 실행
            sc.close(); // 자원 누수 방지
        }
    }
}
