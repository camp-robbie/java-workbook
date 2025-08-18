package main.java.workbook2.classdesign;

import java.util.Scanner;

// Time 클래스를 설계하여 시(hour), 분(minute), 초(second) 필드를 가지고, 일정 초를 더하는 addSeconds(int s) 메서드를 작성한다. 초를 더한 후 시간이 넘어가면 분과 시간도 적절히 증가시키도록 한다.
// 예를 들어 23:59:50에 20초를 더하면 자정 0:0:10이 된다.
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
        second += s;
        minute += second / 60;
        second = second % 60;

        hour += minute / 60;
        minute = minute % 60;

        hour = hour % 24; // 24시간 형식 유지
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int add = sc.nextInt();
        Time time = new Time(h, m, s);
        time.addSeconds(add);
        // TODO: time.hour time.minute time.second 출력
        System.out.println(time.hour + " " + time.minute + " " + time.second);
    }
}