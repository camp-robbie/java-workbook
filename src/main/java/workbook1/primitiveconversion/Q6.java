package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세요 : ");
        String s1 = sc.next();

        System.out.println("두 번째 숫자를 입력하세요 : ");
        String s2 = sc.next();
        // TODO: s1, s2를 int로 변환 후 차이를 byte로 변환하여 출력

        // s1, s2를 int로 변환
        int s1Int = Integer.parseInt(s1);
        int s2Int = Integer.parseInt(s2);

        // 차이를 byte로 변환
        byte sub = (byte) (s1Int - s2Int);

        // 출력
        System.out.println("계산 결과 : " + sub);
    }
}