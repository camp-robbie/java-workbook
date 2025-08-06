package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        // switch문에는 단일 변수만 사용 가능
        switch (day) {
            case 1:                          // 1일 경우
                System.out.println("월");    // 월을 출력함
                break;                       // 종료

            case 2:                          // 2일 경우
                System.out.println("화");    // 화를 출력함
                break;                       // 종료

            case 3:                          // 3일 경우
                System.out.println("수");    // 수를 출력함
                break;                       // 종료

            case 4:                          // 4일 경우
                System.out.println("목");    // 목을 출력함
                break;                       // 종료

            case 5:                         // 5일 경우
                System.out.println("금");   // 금을 출력함
                break;                      // 종료

            case 6:                         // 6일 경우
                System.out.println("토");   // 토를 출력함
                break;                      // 종료

            case 7:                         // 7일 경우
                System.out.println("일");   // 일을 출력함
                break;                      // 종료

            default:  // 이외에 다른 값이 입력될 경우
                System.out.println("예외 처리입니다.");   // 예외 처리
        }
        sc.close(); // 자원 누수 방지
    }
}
