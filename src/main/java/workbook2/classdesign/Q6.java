package main.java.workbook2.classdesign;

import java.util.Scanner;

class Time {
    // 필드
    private int hour;
    private int minute;
    private int second;

    // 생성자
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // getter
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }

    // 일정 초를 더하는 메서드 작성
    public void addSeconds(int second){
        // 만약 입력된 초와 미리 저장된 초를 더했을 때 60보다 작다면
        // 이 객체의 second에 입력된 초를 더해 저장하고,
        // 둘을 더한 값이 60보다 크다면,
        // 더한 값/60을 파라미터로 addMinutes를 호출하고,
        // 값을 60으로 나눈 나머지 값을 second에 저장합니다.
        if(second + this.second<60){
            this.second += second;
        }else{
            addMinutes((this.second+second)/60);
            this.second = (this.second+second)%60;
        }
    }

    private void addMinutes(int minute){
        // 기본적인 작동 원리는 addSecond와 같습니다.
        if(this.minute+minute<60){
            this.minute += minute;
        }else {
            addHours((this.minute+minute)/60);
            this.minute = (this.minute+minute)%60;
        }
    }


    private void addHours(int hour){
        // 만약 입력된 값과 저장된 값을 더했을 때 24보다 작다면,
        // 저장된 값에 입력된 값을 더해 저장하고,
        // 24보다 클 때에는 24로 나누어 나머지 값을 저장합니다.
        if(this.hour+hour<24){
            this.hour += hour;
        }else {
            this.hour = (this.hour+hour)%24;
        }
    }
}

public class Q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();

        // 더할 값
        int add = sc.nextInt();

        // 객체 생성
        Time time = new Time(h, m, s);

        // 메서드 호출
        time.addSeconds(add);

        // 출력합니다.
        System.out.println(time.getHour()+" "+time.getMinute()+" "+time.getSecond());
    }
}