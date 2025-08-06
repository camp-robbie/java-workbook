package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        // TODO: a, b, c 중 최대값 또는 같은 값 여부 출력
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        String result = a == b || b == c || a == c ? "같은 수 존재"
                : (a > b && a > c ? String.valueOf(a)
                : (b > a && b > c ? String.valueOf(b) : String.valueOf(c)));
        System.out.println(result);
    }
}