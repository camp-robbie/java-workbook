package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 수를 입력해주세요:");
        String s1 = sc.next();

        System.out.println("두 번째 수를 입력해주세요:");
        String s2 = sc.next();
        // TODO: s1, s2를 int로 변환 후 차이를 byte로 변환하여 출력
        // Integer.parseInt() 문자열을 숫자열로 바꿔주는 표준 메서드 사용
        int s1i = Integer.parseInt(s1);
        int s2i = Integer.parseInt(s2);
        byte result = (byte) (s1 - s2) ;

        System.out.println("계산 결과" + result);
    }
}