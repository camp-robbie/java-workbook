package main.java.workbook1.loops;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        // TODO: do-while 문으로 3의 배수의 합 계산 후 출력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int sum = 0;

        do {
            if (i % 3 == 0) { // 3의 배수 구하기
                sum += i;
            }
            i++;
        } while (i <= n);

        System.out.println(sum);
    }
}
