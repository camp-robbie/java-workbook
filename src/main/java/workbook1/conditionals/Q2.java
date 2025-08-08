package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        //switch 문을 이용하여 요일 지정하기
        String weekday = switch (day){
            case 1 -> "월요일";
            case 2 -> "화요일";
            case 3 -> "수요일";
            case 4 -> "목요일";
            case 5 -> "금요일";
            case 6 -> "토요일";
            case 7 -> "일요일";
            default -> "1~7 사이의 숫자를 입력하세요.";
        };
        //요일출력
        System.out.println(weekday);
    }
}
