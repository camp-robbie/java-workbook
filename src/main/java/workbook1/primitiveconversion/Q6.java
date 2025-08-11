package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        // TODO: s1, s2를 int로 변환 후 차이를 byte로 변환하여 출력

        Scanner sc = new Scanner(System.in);

        // s1, s2를 입력 받는다.
        System.out.print("s1: ");
        String s1 = sc.next();
        System.out.print("s2: ");
        String s2 = sc.next();

        // s1, s2를 int로 변환
        int ss11 = Integer.parseInt(s1);
        int ss22 = Integer.parseInt(s2);

        // 차이를 byte로 변환하여 출력
        byte difference = (byte) (ss11 - ss22);
        System.out.println("difference = " + difference);

    }
}