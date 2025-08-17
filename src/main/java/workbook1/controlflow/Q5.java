package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // TODO: 각 자리수의 합을 반복해 한 자리 수가 될 때까지 계산 후 출력

        // 한 자리 수가 될 때까지 반복
        while(num >= 10) {         // 10 이상이면 두 자리 수 이상이므로 반복
            int sum = 0;
            int temp = num;
            // 각 자리수를 더하기
            while(temp > 0) {
                sum += temp % 10;  // 마지막 자리 숫자 추출
                temp /= 10;        // 마지막 자리 제거
            }
            num = sum;             // 합을 다시 num에 저장
        }

        // 결과 출력
        System.out.println(num);

        // 이 문제 역시 디버깅 모드를 돌려봐도 이해가 되지 않습니다..
    }
}