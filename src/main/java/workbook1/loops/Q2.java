package main.java.workbook1.loops;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 입력하세요.");
        int n = sc.nextInt();
        // TODO: 홀수 합과 짝수 합 계산 후 출력

        //if문없이...?

        for (int i = 1; i <= n; i += 2) {
            System.out.println(i+"홀수입니다.");
        }

        for (int i = 2; i <= n; i += 2) {
            System.out.println(i+"짝수입니다.");
        }
    }
}
