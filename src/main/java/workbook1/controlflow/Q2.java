package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        // TODO: count개의 정수를 입력받아 양수 개수와 음수 합을 계산 후 출력
        // n개 정수 입력시 양수의 개수  / 음수의 합 출력 코드 작성

        int sum = 0;                                     // 음수의 합을 저장할 sum 선언 및 초기화 (초기값 : 0)
        int positiveCount = 0;                           // 양수 개수를 저장할 positiveCount 선언 및 초기화 (초기값 : 0)

        for (int i = 1; i <= count; i++) {               // i = 1 부터 count 이하까지 for문 반복 (i 후위증감)
            int n = sc.nextInt();                        // count 개의 정수 입력받음 -> 공백 or 엔터로 구분해 입력가능
            if (n > 0) {                                 // 만약 양수라면
                positiveCount++;                         // positiveCount 1 증가 => 양수 개수 카운트
            } else if (n < 0) {                          // 만약 음수라면
                sum += n;                                // sum에 n(음수) 합산
            }
        }
        System.out.print(positiveCount + " " + sum);     // 양수의 개수 와 음수의 합을 공백으로 구분해 출력
    }
}