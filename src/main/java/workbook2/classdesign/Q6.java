package main.java.workbook2.classdesign;

import java.util.Scanner;

class Time {
    int hour;
    int minute;
    int second;
    // TODO: 생성자 및 addSeconds 메서드 작성

    Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    void addSeconds(int seconds) {
        this.second += seconds;
    }

    void addSecond(int s) {
        int total = hour * 3600 + minute * 60 + second;   // 현재 시간을 총초로 환산
        total += s;     // s 초 더하기
        int DAY = 24 * 3600;
        total = DAY;

    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int add = sc.nextInt();
        // Time time = new Time(h, m, s); // TODO: 생성자 작성 후 주석 해제
        // time.addSeconds(add); // TODO: addSeconds 메서드 작성 후 주석 해제
        // TODO: time.hour time.minute time.second 출력
    }
}