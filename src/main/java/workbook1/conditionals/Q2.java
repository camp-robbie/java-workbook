package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        // TODO: switch 문을 이용하여 요일 출력
        // 문제 설명: 1~7 사이의 정수를 입력받아 요일을 출력하는 프로그램을 작성하시오. 1이면 “월”, 2이면 “화”, … 7이면 “일”을 출력한다.
        // switch 문을 사용하고, break를 적절히 사용합니다.
        // 범위를 벗어난 입력은 “잘못된 입력”을 출력합니다.

        switch (day) {
            case 1:
                System.out.println("월");
                break;
            case 2:
                System.out.println("화");
                break;
            case 3:
                System.out.println("수");
                break;
            case 4:
                System.out.println("목");
                break;
            case 5:
                System.out.println("금");
                break;
            case 6:
                System.out.println("토");
                break;
            case 7:
                System.out.println("일");
                break;
            default:
                System.out.println("잘못된 입력");
        }
    }
}
