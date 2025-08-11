package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력해주세요 : ");
        String s1 = sc.next();
        System.out.println("두 번째 숫자를 입력해주세요 : ");
        String s2 = sc.next();
        // TODO: s1, s2를 int로 변환 후 차이를 byte로 변환하여 출력

        //Integer클래스의 parseInt함수와 valueOf함수
        int s1_num = Integer.parseInt(s1);
        int s2_num = Integer.valueOf(s2);

        byte minus = (byte)(s1_num - s2_num);
        System.out.println("두 수의 차이 : " + minus);
    }
}