package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        // TODO: s1, s2를 int로 변환 후 차이를 byte로 변환하여 출력
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);

        byte sub;

        if (a == b) { // 두 수의 차이를 구하는 것이므로 조건부 서식
            sub = 0;
        } else if (a < b) {
            sub = (byte) (b - a);
        } else {
            sub = (byte) (a - b);
        }

        System.out.println(sub);
    }
}