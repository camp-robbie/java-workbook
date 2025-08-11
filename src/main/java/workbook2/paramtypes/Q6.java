package main.java.workbook2.paramtypes;

import java.util.Scanner;

public class Q6 {
    // TODO: addExclamation(String s)와 addExclamation(StringBuilder sb) 메서드 작성
    private static String addExclamation(String s){
        return s+"!";
    }

    private static StringBuilder addExclamation(StringBuilder sb){
        return sb.append("!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder(sc.next());

        addExclamation(s);
        addExclamation(sb);

        // TODO: s와 sb 출력
        System.out.println("불변 객체 String: " + s);
        System.out.println("가변 객체 StringBuilder: " + sb);

        // 리턴값 저장
        s = addExclamation(s);
        System.out.println("불변 객체 String (리턴값 저장): " + s);
    }
}