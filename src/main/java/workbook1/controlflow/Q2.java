package main.java.workbook1.controlflow;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        // TODO: count개의 정수를 입력받아 양수 개수와 음수 합을 계산 후 출력

        int positivenum = 0;
        int negativenum = 0;

        for (int i = 0; i < count; i++) {
            int num = sc.nextInt();

            if (num > 0) {
                positivenum += num;

            } else if (num < 0) {
                negativenum += num;

            }
        }
        System.out.println(positivenum + " " + negativenum);
    }
}