package main.java.workbook1.loops;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        // TODO: 이중 for 문으로 별 패턴 출력
        // 중첩 'for' 반복문 사용
        for(int i =1;i<=m;i++){        // i: 행 번호 (1부터 m까지)

            for(int j =1;j<=n;j++){    // j: 열 번호 (1부터 n까지)
                System.out.print("*"); // 각 열에 * 출력
            }
            System.out.println();      // 한 행 출력 후 줄 바꿈
        }
    }
}
