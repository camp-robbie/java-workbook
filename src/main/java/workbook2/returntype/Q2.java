package main.java.workbook2.returntype;

import java.util.Scanner;

public class Q2 {
    // TODO: toUpper 메서드 작성 (문자열을 대문자로 반환)
    /*
    static으로 String 타입의 toUpper 메서드를 메모리에 올리고
    toUpperCase(); 내장 메서드이며 입력받은 문자열을 대문자로 변환하고
    toUpper 메서드는 새로운 문자열 객체를 반환하며, 원본 문자열은 변경되지 않는다.
     */
    public static String toUpper(String str) {
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String str = sc.next();

            // TODO: toUpper 호출 후 결과 출력
            String result = toUpper(str); // result에 메서드 반환 값 저장

            System.out.println(result); // 결과 값 출력
        } finally { // 항상 실행
            sc.close(); // 자원 누수 방지
        }
    }
}