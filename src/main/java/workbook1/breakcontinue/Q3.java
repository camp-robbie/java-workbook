package main.java.workbook1.breakcontinue;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: 음수가 나오면 break, 양수 평균 출력

        int sum = 0; // 양수들의 합 누적 변수 설정
        int count = 0; // 양수 개수를 셀 변수 설정

        while(true) {
            int num = sc.nextInt(); // 정수를 입력 받음
            if (num < 0 ) {
                break;
            }

            // 입력한 정수가 양수이면 다음 실행
            // sum 에 더하고, 개수 1 증가
            sum += num;
            count++;
        }

        // 변수에 양수 저장이 끝나면 평균을 구함
        if (count > 0){
            double average = (double) sum / count;
            System.out.println(average);
        } else {
            System.out.println("양수를 입력해주세요.");
        }
    }
}