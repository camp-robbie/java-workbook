package main.java.workbook2.classdesign;

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

    public void addSeconds(int s) {
        this.second += s;
        if (this.second >= 60) {
            this.minute += this.second / 60;
            this.second %= 60;
        }
        if (this.minute >= 60) {
            this.hour += this.minute / 60;
            this.minute %= 60;
        }
        if (this.hour >= 24) {
            this.hour %= 24;
        }
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int add = sc.nextInt();
        Time time = new Time(h, m, s); // TODO: 생성자 작성 후 주석 해제
        time.addSeconds(add); // TODO: addSeconds 메서드 작성 후 주석 해제
        // TODO: time.hour time.minute time.second 출력
        System.out.println(time.hour + " " + time.minute + " " + time.second);
        sc.close();
    }
}