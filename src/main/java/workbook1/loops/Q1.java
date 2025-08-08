package main.java.workbook1.loops;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자 n을 입력해주세요");
        int n = sc.nextInt();
        // TODO: while 문을 이용하여 1부터 n까지의 합 출력

        int i = 1;
        int sum = 0;

        while (i<=n) {
            sum += i;
            i++;
        }

        System.out.println("1부터 n까지의 합 : " + sum);
    }
}


