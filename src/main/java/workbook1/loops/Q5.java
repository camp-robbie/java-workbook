package main.java.workbook1.loops;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();

        // 결과적으로 입력값 만큼 반복하는 반복문입니다.
        // 다만, 점점 줄어드는 역삼각형의 특성상 j와의 비교를 위해
        // 반복문이 진행 될 수록 줄어들게 설계하였습니다.
        for(int i=h;i>0;i--){
            // i 번만큼 도는 반복문입니다.
            // i 가 줄어드는 만큼, 해당 반복문의 횟수 또한 줄어듭니다.
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
