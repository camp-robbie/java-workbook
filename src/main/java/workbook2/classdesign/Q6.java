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

    public void addSeconds(int s){
        second += s;
        if(second > 59){
            minute += second / 60;
            second = second % 60;
            if(minute > 59){
                hour += minute / 60;
                minute = minute % 60;
                if(hour > 23){
                    hour = 0;
                }
            }
        }
    System.out.println(hour + " : " + minute + " : " + second);
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        if(h>=24){
            throw new IllegalArgumentException("시간은 23시를 넘을 수 없습니다.");
        }

        int m = sc.nextInt();
        if(m>=60){
            throw new IllegalArgumentException("분은 59분을 넘길 수 없습니다.");
        }

        int s = sc.nextInt();
        if(s>=60){
            throw new IllegalArgumentException("초는 59초를 넘길 수 없습니다.");
        }
        int add = sc.nextInt();
        Time time = new Time(h, m, s);
        time.addSeconds(add);

        // TODO: time.hour time.minute time.second 출력
    }
}