package main.java.workbook1.loops;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        // TODO: 역삼각형 패턴 출력

        for (int i = 0; i <= h; i++) {
            for (int j = 1; j <= h - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();

    }
}
