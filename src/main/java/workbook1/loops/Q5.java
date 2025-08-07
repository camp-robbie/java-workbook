package main.java.workbook1.loops;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        // TODO: 역삼각형 패턴 출력
        for(int i = h; i > 0; i--) {        // i는 h이고, i를 1씩 감소시키며 i가 0보다 클 동안 반복함
            for(int j = 1; j <= i; j++) {   // j는 1이고, j를 1씩 증가시키며 j가 i와 같거나 작을 동안 반복함
                System.out.print("*");      // *을 출력함
            }
            System.out.println();           // 줄바꿈 (개행)
        }
    }
}
