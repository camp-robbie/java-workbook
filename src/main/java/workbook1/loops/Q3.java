package main.java.workbook1.loops;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int sum = 0;
        do {
            sum = sum + i;
            i = i + 3;
        }while (i <= n);

        System.out.print(sum);
        // TODO: do-while 문으로 3의 배수의 합 계산 후 출력
    }
}
