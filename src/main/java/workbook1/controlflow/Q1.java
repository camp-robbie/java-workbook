package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // TODO: 짝수는 합, 홀수는 곱에 반영 후 최종 결과 출력
        int sum = 0;  // 초기값, 합은 0
        int mul = 1;  // 초기값, 곱은 1

        for (int i = 1; i <= n; i++) {    // for 문 -> i가 1부터 n까지 for문을 수행 (후위 증감)
            if (i % 2 == 0) {             // i가 짝수면 if문 실행
                sum += i;                 // sum에 i값을 합산
            }else{                        // i가 홀수면 else문 실행
                mul *= i;                 // mul에 i값 곱해서 누적
            }
        }
        System.out.println(sum+" "+mul);  // 짝수는 합, 홀수는 곱 반영 후 출력
    }
}
