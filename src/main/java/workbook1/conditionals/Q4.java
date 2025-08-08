package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        // TODO: 윤년 판별 로직 구현

        //중첩 조건문을 사용하여 윤년 판별 로직 작성
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("윤년");
        } else {
            //윤년이 아닐 경우 평년 출력
            System.out.println("평년");
        }

        sc.close();
    }
}