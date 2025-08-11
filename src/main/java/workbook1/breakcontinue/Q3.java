package main.java.workbook1.breakcontinue;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: 음수가 나오면 break, 양수 평균 출력

        /// 문제 조건
        //정수 '차례대로' 입력받고       -- 랜덥으로 입력받는다면?
        //음수가 나오면 종료
        //입력한 양수의 평균을 구하고
        //평균은 double로 표시하기 // 6.0
        //사용문법 : while, break;

        int sum = 0; // 양수의 총합
        int numCount = 0; // 양수의 개수 (평균 구할 때 사용)

        while (true) {
            int num = sc.nextInt(); // 사용자로부터 sc로 정수 입력받기

            if (num < 0) break;    // 음수가 입력되면 반복문 종료
            sum += num;     // 입력된 양수를 누적된 합계에 더함
            numCount++;     // 입력된 양수의 개수 1개씩 증가
        }

//        if (numCount == 0) System.out.println("0"); // 양수를 입력하지 않았을 때 "0" 출력
        //또는
        if (numCount == 0) {
            System.out.println("양수를 입력해주세요."); // 양수를 입력하지 않았을 때 "양수를 입력해주세요." 출력
        } else {
            // 평균 구하기 (double 사용)
            double average = (double) sum / numCount;
            System.out.println("평균 : " + average);
        }

        // 스캐너 종료
        sc.close();
    }
}