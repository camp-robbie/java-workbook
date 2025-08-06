package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        // Integer.parseInt() 를 사용하여 String 값을 Int로 변환합니다.
        // 이후 둘을 뺀 뒤, byte 값으로 강제 형변환 하여 출력합니다.
        System.out.println((byte)(Integer.parseInt(s1)-Integer.parseInt(s2)));
    }
}