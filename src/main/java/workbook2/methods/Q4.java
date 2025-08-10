package main.java.workbook2.methods;

import java.util.Scanner;

public class Q4 {
    // TODO: 세 정수의 평균을 반환하는 average 메서드 작성
    public double average(int num1, int num2, int num3) {
        return (double) (num1 + num2 + num3) / 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // TODO: average 호출 후 결과 출력

        Q4 q4 = new Q4();

        System.out.println(q4.average(a, b, c));

        sc.close();
    }
}
