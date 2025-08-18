package main.java.workbook2.classdesign;

import java.util.Scanner;

class Time {
    int hour;
    int minute;
    int second;

    // 생성자 정의 //
    Time(int hour, int minute, int second) {   // 생성자 정의
        this.hour = hour;                      // 필드 초기화
        this.minute = minute;
        this.second = second;
    }

    // 메서드 정의 //
    void addSeconds(int s) {
        second += s;               // s 초 더함
        minute += second / 60;     // 초에서 올림 : 몫(분)만큼 분에 반영 => [ second >= 60경우 minute값 정리 ]
        second %= 60;              // 초를 0~59 사이값으로 정리 => [ second >= 60경우 second값 정리 ]

        hour += minute / 60;       // 분에서 올림 : 몫(시)만큼 분에 반영 => [ minute >= 60경우 hour값 정리 ]
        minute %= 60;              // 분를 0~59 사이값으로 정리 => [ minute >= 60경우 minute값 정리 ]

        hour %= 24;                // 시를 0~23 사이값으로 정리 => [ hour >= 24경우 hour값 정리 ]
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner 생성

        int h = sc.nextInt();                 // 첫 번째 정수 읽어 h에 저장
        int m = sc.nextInt();                 // 두 번째 정수 읽어 m에 저장
        int s = sc.nextInt();                 // 세 번째 정수 읽어 s에 저장
        int add = sc.nextInt();               // 네 번째 정수 읽어 add에 저장 -> "더하려는 초"

        Time time = new Time(h, m, s);        // 새로운 객체(Time(h, m, s)) 생성하여, 참조를 time(타입 Time)에 저장
        time.addSeconds(add);                 // time가 참조하는 addSeconds(add) 메서드 호출 (일정 초 더하는 메서드)

        // TODO: time.hour time.minute time.second 출력
        System.out.println(time.hour +  " " + time.minute + " " + time.second);   // 시 + 분 + 초 출력
        
        sc.close();                           // 입력 닫기
    }
}