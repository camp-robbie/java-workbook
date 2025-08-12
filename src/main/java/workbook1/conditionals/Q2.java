package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        // TODO: switch 문을 이용하여 요일 출력

        Scanner sc = new Scanner(System.in);

        // 스캐너를 통해 사용자에게 숫자를 입력 받는다.
        System.out.print("Enter 1 - 7 Number: ");
        int day = sc.nextInt();

        // 숫자에 맞는 요일이 출력되도록 조건문 작성
        // 1-7 이외의 숫자일 경우 default를 써서 Unknown Day 출력
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Unknown Day");
        }

    }
}
