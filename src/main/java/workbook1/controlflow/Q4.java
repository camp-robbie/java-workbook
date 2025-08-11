package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: 0이 나올 때까지 양수만 합산하는 코드 작성

        int PositiveSum = 0;

        while (true) {
            int num = sc.nextInt();

            if (num == 0) {
                break;
            }

            if (num > 0) {
                PositiveSum += num;
            }
        }
        System.out.println(PositiveSum);
    }
}