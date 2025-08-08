package main.java.workbook1.loops;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        // TODO: 역삼각형 패턴 출력

        //h개의 행 생성(앞에랑 똑같음)
        for (int i = 0; i < h; i++) {
            //행 바뀔수록 별 하나가 줄어드는 식 작성
            //for(int j = h - i; j > 0; j--) {
            //위의 식도 사용 가능
            for(int j = i; j < h; j++) {
                System.out.print("*");
            }
            //줄바꿈
            System.out.println();
        }
        sc.close();
    }
}
