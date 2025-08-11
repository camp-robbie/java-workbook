package main.java.workbook1.loops;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        // TODO: 이중 for 문으로 별 패턴 출력
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                System.out.print("*"); // 줄바꿈 없이 행 만들기
            }
            System.out.print("\n"); // 줄바꿈 (열)
        }
    }
}
