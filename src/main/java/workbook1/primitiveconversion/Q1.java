package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // TODO: a와 b를 double로 자동 형변환하여 더한 뒤 int로 강제 변환하여 출력

        //자동 형변환 : int -> double
        double sum = a + b;

        //강제 형변환 : double -> int
        int result = (int) sum;

        System.out.println(result);

        sc.close();
    }
}