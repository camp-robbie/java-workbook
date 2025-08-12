package main.java.workbook2.paramtypes;

import java.util.Scanner;

public class Q3 {
    // TODO: swapStrings 메서드 작성 (배열을 받아 두 문자열을 교환)
    public static void swapStrings(String[] arr){       // 매개변수가 배열 arr인 swapStrings 메서드 생성
        // 입력 오류 방지 -> if (arr == null || arr.length < 2) return;
        String temp = arr[0];                           // arr[0]값을 임시변수 temp 에 저장
        arr[0] = arr[1];                                // arr[1]값을 arr[0]값에 저장
        arr[1] = temp;                                  // temp(기존 arr[0])값을 arr[1]에 저장    => " 문자열 교환 "
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);            // Scanner 생성
        String s1 = sc.next();                          // 문자열 s1 입력받기(공백/개행 기준으로 문자열 1개)
        String s2 = sc.next();                          // 문자열 s2 입력받기(공백/개행 기준으로 문자열 1개)
        String[] arr = {s1, s2};                        // 문자열 s1, s2를 요소로 가진 arr 배열 생성

        // TODO: swapStrings 메서드 작성 후 주석 해제
        swapStrings(arr);                               // swapStrings 메서드 호출 -> 문자열 교환 완료.

        // TODO: arr[0], arr[1] 출력
        System.out.print(arr[0] + " " + arr[1]);        // " arr[0]값 + 공백 + arr[1]값 " 출력

        sc.close();                                     // 입력 닫기
    }
}
