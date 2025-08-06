package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // TODO: a, b, c 중 최대값 또는 같은 값 여부 출력 함

        if (a == b && b == c) {
            System.out.println("세 수가 모두 같습니다: " + a);
        }
        else if (a == b) {
            System.out.println("a와 b가 같습니다: " + a);
        } else if (b == c) {
            System.out.println("b와 c가 같습니다: " + b);
        } else if (a == c) {
            System.out.println("a와 c가 같습니다: " + a);
        }
        else {
            if (a > b && a > c) {
                System.out.println("최댓값은 a입니다: " + a);
            } else if (b > a && b > c) {
                System.out.println("최댓값은 b입니다: " + b);
            } else {
                System.out.println("최댓값은 c입니다: " + c);
            }
        }
    }
}