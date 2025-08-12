package main.java.workbook2.classdesign;

import java.util.Scanner;

class Time {
    int hour;
    int minute;
    int second;
    // TODO: 생성자 및 addSeconds 메서드 작성
    // 생성자 (매개변수: int hour, int minute, int second)
    public Time(int hour, int minute, int second) {
        this.hour = hour;       // 매개변수 hour 값을 Time 필드 hour에 저장함
        this.minute = minute;   // 매개변수 minute 값을 Time 필드 minute에 저장함
        this.second = second;   // 매개변수 second 값을 Time 필드 second에 저장함
    }

    // addSeconds 메서드 (매개변수: int add)
    void addSeconds(int add) {
        second += add;              // second = second + add;
        minute += second / 60;      // minute = minute + (second / 60)
        hour += minute / 60;        // hour = hour + (minute / 60)

        second %= 60;               // second = second % 60 (60 넘어가면 숫자 60 아래로 다운시켜야 하기 때문)
        minute %= 60;               // minute = minute % 60 (60 넘어가면 숫자 60 아래로 다운시켜야 하기 때문)

        hour %= 24;                 // hour = hour % 24 (24 넘어가면 24 아래로 다운시켜야 하기 때문)
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
    }
}