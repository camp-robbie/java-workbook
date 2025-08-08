package main.java.workbook1.loops;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();

        // TODO: 역삼각형 패턴 출력
        // 삼각형 높이 H를 입력받아 아래와 같은 역삼각형(*) 패턴을 출력하는 프로그램을 작성하시오.
        // 중첩 for 반복문을 사용하고, 행이 진행될수록 출력하는 별의 수를 감소시킵니다.

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h - i; j++) { // h-i : 별의 개수 감소
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
