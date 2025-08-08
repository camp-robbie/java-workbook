package main.java.workbook1.loops;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        // TODO: 역삼각형 패턴 출력
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
