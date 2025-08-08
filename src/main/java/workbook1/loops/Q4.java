package main.java.workbook1.loops;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("당신의 가로 별 숫자는? : ");
        int m = sc.nextInt();
        System.out.println("당신의 세로 별 숫자는? : ");
        int n = sc.nextInt();
        // TODO: 이중 for 문으로 별 패턴 출력

        for (int j = 1; j <= n; j++) {
            for (int i = 0; i < m; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
