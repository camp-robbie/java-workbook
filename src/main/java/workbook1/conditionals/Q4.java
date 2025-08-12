package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        // TODO: 윤년 판별 로직 구현
        // 윤년은 연도가 4의 배수이면서 100의 배수가 아니거나 400의 배수인 해이다.

        // 사용자에게 년도를 입력 받는다.
        Scanner sc = new Scanner(System.in);
        System.out.print("Year: ");
        int year = sc.nextInt();

        // 윤년해를 계산하는 조건식을 만든다.
//        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
//            System.out.println("Leap Year");
//        } else {
//            System.out.println("Common Year");
//        }

        // 중첩 조건문을 사용한 if
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Leap Year");
                } else {
                    System.out.println("Common Year");
                }
            } else {
                System.out.println("Leap Year");
            }
        } else {
            System.out.println("Common Year");
        }
    }
}
