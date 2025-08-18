package main.java.workbook2.paramtypes;

import java.util.Scanner;

public class Q6 {
    // TODO: addExclamation(String s)와 addExclamation(StringBuilder sb) 메서드 작성
    public static void addExclamation(String s){
        s += "!";
    }

    public static void addExclamation(StringBuilder sb){
        sb.append("!");
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder(sc.next());
        addExclamation(s);
        addExclamation(sb);
        // TODO: s와 sb 출력
        System.out.println(s + " " + sb);
    }
}