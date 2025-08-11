package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        // TODO: 윤년 판별 로직 구현

        if( year % 4 == 0 ){ // 윤년의 년도가 4의 배수이면 중첩 if문으로

            if( year % 100 != 0 || year % 400 == 0 ){ // 윤년의 년도가 100의 배수가 아니거나(||) 400의 배수이면

                System.out.println("윤년"); // 출력!
            }
        }
    }
}
