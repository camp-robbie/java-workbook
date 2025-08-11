package main.java.workbook1.loops;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        // TODO: 역삼각형 패턴 출력
        // 중첩 'for' 문 사용
        for (int i=h;i>=1;i--){        // 첫번째 for문 -> i : 행 번호 (h부터 1까지 감소)
            for(int j=1;j<=i;j++){     // 두번째 for문 -> j : 열 번호 (1부터 i까지 반족)
                System.out.print("*"); // 각 열마다 * 출력
            }
            System.out.println();      // 한 행 출력 후 줄 바꿈
        }
    }
}
