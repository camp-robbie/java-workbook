package main.java.workbook2.paramtypes;

import java.util.Scanner;

public class Q1 {
    // TODO: primitiveParam 메서드 작성 (int x를 받아 x에 10을 더함)
    public static int primitiveParam(int x) {
        x = x + 10;
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int result = primitiveParam(x);

        // TODO: 원래 x와 메서드 반환 값 출력
        // 메서드 내에서 x를 변경하지만 호출한 곳의 값은 변경되지 않는 것을 확인합니다.
        System.out.print(x + " "); // 원래 x 값 출력
        System.out.println(result); // 메서드 반환 값 출력

    }
}