package main.java.workbook2.paramtypes;

import java.util.Scanner;

public class Q1 {
    // TODO: primitiveParam 메서드 작성 (int x를 받아 x에 10을 더함)
    // primitiveParam 메서드 //
    public static int primitiveParam(int x) {           //  매개변수 x를 갖는 primitiveParam 메서드 생성
        return x + 10;                                  //  호출 시, x + 10 값을 반환
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);            //  Scanner 생성
        int x = sc.nextInt();                           //  변수 x에 정수 입력받기 (공백/개행 무시)
        // TODO: primitiveParam 메서드 작성 후 주석 해제
        int result = primitiveParam(x);                 //  변수 result에 primitiveParam 메서드 반환값 저장 -> x + 10
        // TODO: 원래 x와 메서드 반환 값 출력
        System.out.print(x + " ");                      //  x값 출력 (+ 공백)
        System.out.print(result);                       //  result값 출력

    }
}