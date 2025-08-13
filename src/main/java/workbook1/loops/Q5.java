package main.java.workbook1.loops;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("삼각형 높이 h: ");
        int h = sc.nextInt();
        // TODO: 역삼각형 패턴 출력

        //i < h → i는 0부터 (h - 1)까지, 즉 총 h번 반복
        for (int i = 0; i < h; i++) {           // h 행 : 줄 수
            // j < h - i → j는 0부터 (h - i - 1)까지, 즉 총 (h - i)번 반복
            for (int j = 0; j < h - i; j++) {   // 줄 마다 별 개수가 줄어든다
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/// 설명
//for (int i = 0; i < h; i++)
//i는 0부터 시작해서 < h → 즉, 0 ~ h - 1까지 반복
//총 h번 반복

//for (int j = 0; j < h - i; j++)
//이건 i의 값에 따라 반복 횟수가 줄어드는 구조

/*
예시: h = 4일 때 출력 패턴과 반복 흐름

i = 0 → j < 4 → ****
i = 1 → j < 3 → ***
i = 2 → j < 2 → **
i = 3 → j < 1 → *

즉, i행일 때 별은 (h - i)개
*/