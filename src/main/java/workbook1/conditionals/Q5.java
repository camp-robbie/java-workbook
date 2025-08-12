package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        // TODO: a, b, c 중 최대값 또는 같은 값 여부 출력

        // 값 3개를 입력 받는다.
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        int a = sc.nextInt();
        System.out.print("b: ");
        int b = sc.nextInt();
        System.out.print("c: ");
        int c = sc.nextInt();

        // 조건문을 사용하여 최댓값 또는 같은 값 여부를 확인한다.
        if ((a == b) || (b == c) || (a == c)) {
            System.out.println("The same number exists");
        } else if ((a > b) || (a > c)) {
            System.out.println("A is the biggest number");
        } else if (b > c) {
            System.out.println("B is the biggest number");
        } else {
            System.out.println("C is the biggest number");
        }

    }
}