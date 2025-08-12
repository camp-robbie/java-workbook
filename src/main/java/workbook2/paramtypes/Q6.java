package main.java.workbook2.paramtypes;

import java.util.Scanner;

public class Q6 {
    // TODO: addExclamation(String s)와 addExclamation(StringBuilder sb) 메서드 작성
    public static void addExclamation(String s) {   // addExclamation 메서드 (매개변수: String s)
        s = s + "!";                                // s에 !를 추가함
    }

    public static void addExclamation(StringBuilder sb) {   // addExclamation 메서드 (매개변수: StringBuilder sb)
        sb.append("!");                                              // sb에 !를 추가함
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder(sc.next());
        addExclamation(s); // TODO: addExclamation(String s) 메서드 작성 후 주석 해제
        addExclamation(sb); // TODO: addExclamation(StringBuilder sb) 메서드 작성 후 주석 해제
        // TODO: s와 sb 출력
        System.out.println(s + " " + sb);   // s와 sb의 결과를 출력함
    }
}