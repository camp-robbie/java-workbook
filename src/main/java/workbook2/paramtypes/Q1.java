package main.java.workbook2.paramtypes;

import java.util.Scanner;
public class Q1 {
    // TODO: primitiveParam 메서드 작성 (int x를 받아 x에 10을 더함)
    public static int primitiveParam(int x) {   // primitiveParam 메서드(반환형 int)
        return (x + 10);                        // x + 10을 반환함
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int result = primitiveParam(x); // TODO: primitiveParam 메서드 작성 후 주석 해제
        // TODO: 원래 x와 메서드 반환 값 출력
        System.out.println(x + " " + result);   // 결과를 출력함
    }
}