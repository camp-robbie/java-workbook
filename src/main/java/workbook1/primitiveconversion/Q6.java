package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        // TODO: s1, s2를 int로 변환 후 차이를 byte로 변환하여 출력
        int Is1 = Integer.parseInt(s1); // s1 형변환 (String -> int)
        int Is2 = Integer.parseInt(s2); // s2 형변환 (String -> int)

        byte sub = (byte)(Is1 - Is2); // 두 수의 차 강제 형 변환 (int -> byte)

        System.out.println(sub); // 두 수의 차(byte) 출력
    }
}