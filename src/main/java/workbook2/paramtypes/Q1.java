package main.java.workbook2.paramtypes;

import java.util.Scanner;

public class Q1 {
    // TODO: primitiveParam 메서드 작성 (int x를 받아 x에 10을 더함)
    public static int primitiveParam(int x) {

        // 기본형 매개변수: 값 자체를 전달
        // int x를 받아 10을 더하고 반환

        x += 10; // 메서드 내부에서만 x 값이 바뀜
        return x;  // 바뀐 값을 반환
    }

    // primitiveParam 라는 매서드를 먼저 정의하고,
    // main 에서 초기 값과 메서드 처리 후 값을 출력.
    // TODO: 원래 x와 메서드 반환 값 출력
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); // 사용자로부터 정수 입력
        int result = primitiveParam(x); // 메서드 호출, x 값 전달
        System.out.println(x + " " + result);
    }



}