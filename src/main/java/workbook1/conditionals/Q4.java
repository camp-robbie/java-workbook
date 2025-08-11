package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(year % 4 == 0 && year % 100 != 0) {      // year이 4의 배수이면서 100의 배수가 아닐 경우
            System.out.println("윤년");
        } else if(year % 400 == 0) {                // year이 400의 배수
            System.out.println("윤년");
        } else {
            System.out.println("윤년이 아닙니다.");   // 윤년이 아닙니다. 예외 처리
        }

        sc.close(); // 자원 누수 방지
    }
}
