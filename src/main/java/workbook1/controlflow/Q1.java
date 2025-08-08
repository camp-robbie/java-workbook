package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 초기 합
        int sum = 0;
        // 초기 곱
        int mul = 1;

        for(int i = 1; i<=n; i++){      //1부터 n까지 반복문
            if(i%2 == 0){               //짝수인 경우
                sum += i;               //합에 반영
            }else if(i%2 == 1){         //홀수인 경우
                mul *= i;               //곱에 반영
            }
        }
        //최종 결과 출력
        System.out.println(sum +" "+ mul);
    }
}
