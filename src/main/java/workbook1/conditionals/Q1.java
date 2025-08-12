package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        // TODO: num의 부호를 판단하여 출력

        Scanner sc = new Scanner(System.in);

        // 사용자에게 정수를 입력 받는다.
        System.out.print("Number: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Positive Number");
        } else if (num < 0) {
            System.out.println("Negative Number");
        } else {
            System.out.println("0");
        }

    }
}
