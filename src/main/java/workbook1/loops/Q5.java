package main.java.workbook1.loops;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("삼각형의 높이를 입력하세요");
        int h = sc.nextInt();
        // TODO: 역삼각형 패턴 출력

        for (int i = h; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
