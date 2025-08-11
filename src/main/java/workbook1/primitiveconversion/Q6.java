package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next(); // 첫번째 입력 값
        String s2 = sc.next(); // 두번째 입력 값

        // s1, s2를 int로 변환
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);

        byte result = (byte) (a - b); // byte result에 결과 값을 자동 형변환하여 연산

        System.out.println(result);
        sc.close();
    }
}