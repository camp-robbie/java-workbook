package main.java.workbook2.paramtypes;

import java.util.Scanner;

public class Q1 {
    public static int primitiveParam(int x) {
        x += 10;
        return x;
    }
    // TODO: primitiveParam 메서드 작성 (int x를 받아 x에 10을 더함)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("어디 한 번 날 바꿔보시지 : ");
        int x = sc.nextInt();
        int originalX = x;
        int result = primitiveParam(x); // TODO: primitiveParam 메서드 작성 후 주석 해제
        // TODO: 원래 x와 메서드 반환 값 출력

        System.out.println("원래의 나" + originalX + "새로워진 나" + result);

    }
}