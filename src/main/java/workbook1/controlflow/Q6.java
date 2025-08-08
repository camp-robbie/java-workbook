package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // TODO: 1~n까지 중 자리수 합이 5의 배수인 수의 개수 출력

         int count = 0; // 5배수 수를 여기에 저장

         for(int i = 0; i < n; i++) {
             int sum = 0;
             int sumtemp = i;

             //i의 각 자리 수 합
             while(sumtemp > 0) {
                 sum += sumtemp % 10;
                 sumtemp /= 10;
             }

             if (sum % 5 == 0) {
                 count++;
             }
         }
        System.out.println();
    }
}