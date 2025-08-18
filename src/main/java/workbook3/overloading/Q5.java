package main.java.workbook3.overloading;

import java.util.Scanner;

public class Q5 {
    // TODO: format 오버로딩 (int), (String), (String,int)

    static String format(int num) {
        return "정수:" + num;
    }

    static String format(String s) {
        return "문자열: " + s;
    }

    static String format(String name, int age) {
        return name + "(" + age + ")";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        // TODO: format 메서드 작성 후 아래 주석 해제
         System.out.println(format(name));
         System.out.println(format(age));
         System.out.println(format(name, age));
    }
}