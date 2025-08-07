package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        // TODO: 윤년 판별 로직 구현

        // 1. 중첩 조건문 활용
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("윤년");   // 1 단계. 100의 배수 && 400의 배수
                } else {
                    System.out.println("평년");   // 2 단계. 100의 배수 && ! 400의 배수
                }
            } else {
                System.out.println("윤년");   // 3 단계. 4의 배수 && ! 100의 배수
            }
        } else {
            System.out.println("평년");   // 4 단계. ! 4의 배수
        }

        // * 2. 조건문 활용
        // (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
//        if (year % 4 == 0 && year % 100 != 0) {
//            System.out.println("윤년");
//        } else if (year % 400 == 0) {
//            System.out.println("윤년");
//        } else {
//            System.out.println("평년");
//        }

        // 3. 논리 연산자, 비교 연산자 활용
        // 우선 순위:  논리 > 비교
//        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
//            System.out.println("윤년");
//        } else {
//            System.out.println("평년");
//        }

        sc.close();

    }
}
