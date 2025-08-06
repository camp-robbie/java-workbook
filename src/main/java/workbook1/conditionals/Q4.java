package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        // TODO: 윤년 판별 로직 구현
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        String result = (year % 4 == 0 && year % 100 != 0)
                || year % 400 == 0
                ? "윤년" : "평년";

        System.out.println(result);
    }
}
