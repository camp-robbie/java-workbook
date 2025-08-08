package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: 0이 나올 때까지 양수만 합산하는 코드 작성
        // 한 줄에 정수들을 입력받아 0이 입력될 때까지 양수만 합산하여 출력하는 프로그램을 작성하시오
        // while 문을 사용하고, 입력값이 0이면 즉시 반복을 종료합니다.

        int sum = 0; // 합산 초기화

        while (true) {
            int num = sc.nextInt(); // 정수 입력

            if (num > 0) { // 양수면
                sum += num; // 합산
            }

            if (num == 0) { // 0이면
                break; // 즉시 반복 종료
            }
        }
        System.out.println(sum); // 출력
    }
}