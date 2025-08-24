package main.java.workbook3.overloading;

import java.util.Scanner;

// `format` 메서드를 오버로딩하여 정수와 문자열을 받아 “정수: 값” 또는 “문자열: 값” 형식으로 출력하는 메서드,
// 그리고 이름과 나이를 받아 “이름(나이)” 형식으로 출력하는 세 번째 버전을 작성하시오.
public class Q5 {
    // TODO: format 오버로딩 (int), (String), (String,int)
    // format 오버로딩 (int)
    public static String format(int age) {
        return "정수: " + age;            // 입력받은 정수가 무엇인지 반환함
    }

    // format 오버로딩 (String)
    public static String format(String name) {
        return "문자열: " + name;          // 입력받은 문자열 무엇인지 반환함
    }

    // format 오버로딩 (String, int)
    public static String format(String name, int age) {
        return name + "(" + age + ")";    // 입력받은 문자열과 정수가 무엇인지 반환함
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        // 스캐너 열기
        String name = sc.next();                    // name의 값을 입력받음
        int age = sc.nextInt();                     // age의 값을 입력받음

        // TODO: format 메서드 작성 후 아래 주석 해제
         System.out.println(format(name));          // format(name)의 결과를 출력함
         System.out.println(format(age));           // format(age)의 결과를 출력함
         System.out.println(format(name, age));     // format(name, age)의 결과를 출력함

        sc.close();                                 // 스캐너 닫기
    }
}