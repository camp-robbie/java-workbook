package main.java.workbook2.paramtypes;

import java.util.Scanner;

public class Q6 {
    // TODO: addExclamation(String s)와 addExclamation(StringBuilder sb) 메서드 작성
    // addExclamation(String s) 메서드//
    public static void addExclamation(String s){
        s += "!";                                           // s(String 타입)에 "!" 추가
    }

    // addExclamation(StringBuilder sb) 메서드//
    public static void addExclamation(StringBuilder sb){
        sb.append("!");                                     // sb(StringBuilder 타입)에 "!" 추가
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                // Scanner 생성
        String s = sc.next();                               // 공백/개행 전 문자열을 입력받아 s(String 타입)에 저장
        StringBuilder sb = new StringBuilder(sc.next());    // 공백/개행 전 문자열을 입력받아 sb(StringBuilder 타입)에 저장

        // TODO: addExclamation(String s) 메서드 작성 후 주석 해제
        addExclamation(s);                                  // addExclamation(String s) 메서드 호출 => 불변

        // TODO: addExclamation(StringBuilder sb) 메서드 작성 후 주석 해제
        addExclamation(sb);                                 // addExclamation(StringBuilder sb) 메서드 호출 => 가변

        // TODO: s와 sb 출력
        System.out.println(s + " " + sb);                   // 결과 출력  =>  s = 기존 값 출력 (메서드 호출 했어도 변경x)
                                                            //          =>  sb = 변경된 결과 출력
    }
}

/*  Q. addExclamation(StringBuilder sb) 메서드에 ddExclamation(String s) 메서드처럼
       " + 연산 이용해 대입 "하면 오류가 발생하는 이유?

          [ sb += "!" ]  =>  [ sb = sb + "!" ]

            - [ sb + "!" ] 연산 자체는 가능!
               -> '+' 연산은 한쪽이 String 이므로 문자열 결합이 일어남 => " 결과 타입 = String "

            - 그러나!! " sb 타입 = StringBuilder "
               => 즉, String 타입을 StringBuilder 타입에 대입하려해서
                      타입 불일치로 컴파일 오류 발생!
 */

/*   [ sb + "!"] = Sting      /     [ sb + '!'] = char

     참고1) append 사용시엔 "!"  /  '!'  둘 다 사용가능

     참고2) 덧셈 연산 경우 [ sb + '!' ]는 어느 쪽도 String 아님
             => 컴파일 에러 발생!
 */