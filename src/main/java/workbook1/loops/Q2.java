package main.java.workbook1.loops;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 홀수 합과 짝수 합 변수 초기화하기
        int oddSum = 0;
        int evenSum = 0;
        //홀수 합 구하기
        for(int i = 1; i<=n; i += 2){
            oddSum += i;
        }
        //짝수 합 구하기
        for(int j = 2; j<=n; j += 2){
            evenSum += j;
        }
        System.out.println("홀수 합: " + oddSum + " 짝수 합: " + evenSum);
    }
}
