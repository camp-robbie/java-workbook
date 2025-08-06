package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // TODO: a, b, c 중 최대값 또는 같은 값 여부 출력

        if  (a == b && a == c && b == c) {
            System.out.println("All three numbers are the same");
        } else {
            if (a > b && a > c) {
                System.out.println("A is the biggest number");
            } else if (b > a && b > c) {
                System.out.println("B is the biggest number");
            } else if (c > a && a > b) {
                System.out.println("C is the biggest number");
            }
        }
    }
}