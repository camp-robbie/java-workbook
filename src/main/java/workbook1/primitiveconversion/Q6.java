package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        // TODO: s1, s2를 int로 변환 후 차이를 byte로 변환하여 출력

        // s1, s2를 int로 변환
        int ns1 = Integer.parseInt(s1);
        int ns2 = Integer.parseInt(s2);

        // 차이를 byte로 변환
        int ns = ns1 - ns2;
        byte result = (byte) ns;

        System.out.println(result); // 출력
    }
}