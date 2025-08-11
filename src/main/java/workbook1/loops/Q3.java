package main.java.workbook1.loops;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // TODO: do-while 문으로 3의 배수의 합 계산 후 출력

        int sum = 0;
        int i = 0;

        do {
            sum += i;
            i += 3;

        } while (i <= n);
    }
}
