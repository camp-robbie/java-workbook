package main.java.workbook1.loops;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        for(int i = 1; i <= m; i++){
            for (int p = 1; p <= n; p++){
                System.out.print("*");
            }
            System.out.println();
        }
        // TODO: 이중 for 문으로 별 패턴 출력
    }
}
