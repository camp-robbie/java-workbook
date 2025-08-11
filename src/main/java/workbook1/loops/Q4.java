package main.java.workbook1.loops;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        // TODO: 이중 for 문으로 별 패턴 출력
        for(int i = 0; i < m; i++) {        // i는 0부터 i가 m보다 작을 때까지 1씩 증가하며 반복 수행
            for(int j = 0; j < n; j++) {    // j는 0부터 j가 n보다 작을 때까지 1씩 증가하며 반복 수행
                System.out.print("*");      // 줄바꿈 없이 *을 출력함
            }
            System.out.println();           // 줄바꿈 수행
        }
    }
}
