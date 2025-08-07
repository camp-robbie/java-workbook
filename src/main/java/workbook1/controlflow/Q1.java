package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // TODO: 짝수는 합, 홀수는 곱에 반영 후 최종 결과 출력
        int sum = 0;    // 초기 합은 0
        int mul = 1;    // 초기 곱은 1

        // for 문과 if-else 문을 함께 사용
        for(int i = 1; i <= n; i++) {   // i는 1부터 n보다 같거나 작을 때까지 반복함
            if(i % 2 == 0) {            // i를 2로 나눈 나머지가 0이라면
                sum += i;               // sum = sum + i;
            } else {                    // 그렇지 않다면 (홀수라면)
                mul *= i;               // mul = mul * i;
            }
        }
        System.out.println(sum + " " + mul);    // 결과를 출력함
    }
}
