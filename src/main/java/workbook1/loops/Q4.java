package main.java.workbook1.loops;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); // 행
        int n = sc.nextInt(); // 열
        // TODO: 이중 for 문으로 별 패턴 출력

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*"); // 별 출력 (행)
            }
            System.out.println(); // 한 행 출력 후 줄바꾸기 (열)
        }
    }
}
//바깥 for문이 한 번 돌 때 → 안쪽 for문이 전체 실행
//안쪽 for문이 한 번 끝나면 → 줄바꿈
//다시 바깥 for문이 돌아서 → 새로운 줄 시작