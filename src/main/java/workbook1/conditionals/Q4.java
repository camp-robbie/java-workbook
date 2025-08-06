package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        // TODO: 윤년 판별 로직 구현

        // 윤년은 연도가 4의 배수이면서 100의 배수가 아니거나 400의 배수인 해이다.

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " = 윤년");
        } else {
            System.out.println(year + " = 평년");
        }

    }
}
