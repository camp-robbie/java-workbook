package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("연도를 입력해주세요 : ");
        int year = sc.nextInt();
        // TODO: 윤년 판별 로직 구현

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("윤년입니다.");
        } else if (year % 100 == 0) {
            System.out.println("윤년이 아닙니다.");
        } else {
            System.out.println("숫자를 입력하세요 휴먼..");
        }
    }
}
