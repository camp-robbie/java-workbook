package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        // TODO: s1, s2를 int로 변환 후 차이를 byte로 변환하여 출력

        //s1, s2를 Integer.parseInt()를 이용하여 정수로 변환
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);

        //두 수의 차이를 byte형으로 강제 형변환하여 출력
        byte result = (byte)(a-b);

        System.out.println(result);

        sc.close();
    }
}