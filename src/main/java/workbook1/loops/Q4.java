package main.java.workbook1.loops;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        // TODO: 이중 for 문으로 별 패턴 출력
        // 두 개의 정수 M과 N을 입력받아 M행 N열의 별(*) 패턴을 출력하는 프로그램을 작성하시오.
        // 중첩 for 반복문을 사용하여 행과 열을 출력합니다.

        for (int i = 0; i < m; i++) { // m번 반복(행), (실수)i <= m 이렇게 하면 m+1개 출력됨.
            for (int j = 0; j < n; j++) { // n번 반복(열), (실수)j = i부터 시작 → 별의 개수가 줄어드는 삼각형 모양이 된다.
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
