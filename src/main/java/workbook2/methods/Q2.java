package main.java.workbook2.methods;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 입력받기 위한 Scanner 생성
        String str = sc.nextLine();             // 문자열 입력 받아 str에 저장

        // TODO: stringLength 호출 후 결과 출력
        int length = stringLength(str);         // length 변수에 stringLength 호출 후 결과 저장
        System.out.println(length);             // 호출된 length(stringLength) 출력

        sc.close();                             // 입력 닫기

    }

    // TODO: 문자열 길이를 반환하는 stringLength 메서드 작성
    // stringLength 메서드
    public static int stringLength(String str){ // stringLength 메서드 구현 -> 매개변수 str 받음
        return str.length();                     // 호출 시, str 길이를 int로 반환
    }
}
