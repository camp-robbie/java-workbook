package main.java.workbook2.classdesign;

import java.util.InputMismatchException;
import java.util.Scanner;

class Time {
    int hour;
    int minute;
    int second;

    // TODO: 생성자 및 addSeconds 메서드 작성
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void addSeconds(int add) {
        // 초
        second += add; // 입력 값 즉 초를 더하고
        minute += second / 60; // 60초를 나눈 몫을 분에 더하고
        second %= 60; // 저장되어 있는 초를 1분(60) 나머지 값을 초의 값으로 저장하고

        // 분
        hour += minute / 60; // 60분을 나눈 몫을 시간에 더하고
        minute %= 60; // 저장되어 있는 분을 1시간(60) 나머지 값을 분의 값으로 저장하고

        // 시간
        hour %= 24; // 저장되어 있는 시간을 하루(24)로 나눈 후 나머지 값을 시간의 값으로 저장한다.
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int h = sc.nextInt();
            int m = sc.nextInt();
            int s = sc.nextInt();
            int add = sc.nextInt();

            Time time = new Time(h, m, s); // TODO: 생성자 작성 후 주석 해제

            time.addSeconds(add); // TODO: addSeconds 메서드 작성 후 주석 해제

            // TODO: time.hour time.minute time.second 출력
            System.out.println(time.hour + ":" + time.minute + ":" + time.second);
        } catch (InputMismatchException e) { // 숫자 이외의 값을 입력 시
            System.out.println("숫자만 입력해 주세요!"); // 예외 처리
        } finally { // 항상 실행
            sc.close(); // 자원 누수 방지
        }
    }
}