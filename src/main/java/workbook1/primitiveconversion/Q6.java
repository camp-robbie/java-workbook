package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("s1 = ");
        String s1 = sc.next();
        System.out.print("s2 = ");
        String s2 = sc.next();
        // TODO: s1, s2를 int로 변환 후 차이를 byte로 변환하여 출력

        int stringNumber1 = Integer.parseInt(s1);
        int stringNumber2 = Integer.parseInt(s2);

        byte result1 = (byte) stringNumber1;
        byte result2 = (byte) stringNumber2;
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        sc.close();




    }
}