package main.java.workbook1.breakcontinue;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO: 음수가 나오면 break, 양수 평균 출력
        // while 문과 break 사용
        int sum = 0;       // 합계를 계산할 변수
        int count = 0;     // 입력받을 정수 개수를 저장할 변수

        while(true) {       // true인 동안에 반복 수행
            int num = sc.nextInt(); // 정수를 입력받음
            if(num < 0) {           // num이 0보다 작으면
                break;              // 반복을 멈춤
            }
            sum += num;             // sum = sum + num;
            count++;                // count 1 증가
        }

        double avg = sum / (double)count;   // 평균을 구하기 위한 변수 avg
        System.out.println(avg);            // 평균을 출력함
    }
}