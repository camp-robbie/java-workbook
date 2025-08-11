package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        // TODO: s1, s2를 int로 변환 후 차이를 byte로 변환하여 출력

        int intS1 = Integer.parseInt(s1);   // 문자열 s1을 int형으로 형변환하여 intS1 변수에 저장함

        int intS2 = Integer.parseInt(s2);   // 문자열 s2을 int형으로 형변환하여 intS2 변수에 저장함

        byte sub = (byte)(intS1 - intS2);       // 차이를 byte로 강제 형변환하여 byte형 변수 sub에 저장함
        System.out.println("sub = " + sub);     // 결과를 확인하기 위해서 출력함
    }
}