package main.java.workbook1.loops;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        // 2중 for 문입니다.
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                // 같은 라인에 찍혀져야 하므로, println 이 아니라
                // 그냥 print를 사용합니다. (같은 줄에 출력)
                System.out.print("*");
            }
            // 개행을 위한 println 입니다.
            System.out.println();
        }
    }
}
