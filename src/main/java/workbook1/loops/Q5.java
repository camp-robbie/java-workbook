package main.java.workbook1.loops;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();

        for(int i = 0; i < h; i++){
            for(int p = h - i ; p > 0; p--){
                System.out.print("*");
            }
            System.out.println();
        }
        // TODO: 역삼각형 패턴 출력
    }
}
