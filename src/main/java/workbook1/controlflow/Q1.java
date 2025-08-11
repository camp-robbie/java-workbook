package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        // TODO: 짝수는 합, 홀수는 곱에 반영 후 최종 결과 출력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int add = 0;
        int mul = 1;

        for (int i = 0; i <= n; i++) {
            if(i%2 == 0){
                add += i;
            } else {
                mul = mul * i;
            }
        }
        System.out.println(add + " " + mul);
    }
}
