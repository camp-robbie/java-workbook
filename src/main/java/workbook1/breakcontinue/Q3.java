package main.java.workbook1.breakcontinue;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: 음수가 나오면 break, 양수 평균 출력
        // 사용자로부터 정수를 차례대로 입력받다가 음수가 나오면 입력을 중단하고, 입력된 양수들의 평균을 출력하는 프로그램을 작성하시오.
        // while 문과 break를 사용합니다.
        // 음수가 입력되면 반복을 종료합니다.

        int sum = 0; // 양수 합
        int count = 0; // 양수 개수

        while (true) {
            int num = sc.nextInt(); // 정수 입력

            if (num < 0) { // 음수
                break; // 반복 종료
            }

            sum += num; // 양수 합산
            count++; // 양수 개수 증가
        }

        if (count > 0) { // 양수
            double avg = (double) sum / count; // 평균
            System.out.println(avg); // 평균 출력
        }
    }
}