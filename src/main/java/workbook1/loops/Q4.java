package main.java.workbook1.loops;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        // TODO: 이중 for 문으로 별 패턴 출력

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
        // solution
        // 이중 for 문으로 별 패턴 출력
        for (int i = 0; i < m; i++) {   // 행을 담당하는 외부 반복문 (M번 반복)
            for (int j = 0; j < n; j++) {   // 열을 담당하는 내부 반복문 (N번 반복)
                System.out.print("*");  // 별 출력 (줄바꿈 없이)
            }
            System.out.println();   // 한 행이 끝나면 줄바꿈
        }
        */

        sc.close();

    }
}
