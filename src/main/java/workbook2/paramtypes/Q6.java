package main.java.workbook2.paramtypes;

import java.util.Scanner;

public class Q6 {
    // TODO: addExclamation(String s)와 addExclamation(StringBuilder sb) 메서드 작성
    // String과 StringBuilder 객체를 매개변수로 받아 각각 문자열 뒤에 “!”를 추가하는 메서드를 구현하고, 호출 후 원본 객체의 변화를 비교하여 출력한다.
    public static String addExclamation(String s) {
       return s + " !"; // String은 불변 객체라서 변경된 값을 반환
    }

    public static void addExclamation(StringBuilder sb) {
        sb.append("!"); // StringBuilder는 가변 객체라서 원본을 직접 수정
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder(sc.next());
        s = addExclamation(s); // String 불변 객체이기 때문에 다시 변수에 담아주기
        addExclamation(sb);

        // TODO: s와 sb 출력
        System.out.println(s + " " + sb);
    }
}