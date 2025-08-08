package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // TODO: 짝수는 합, 홀수는 곱에 반영 후 최종 결과 출력

        int sum = 0;//짝수의 합을 저장할 변수
        int mul = 1;//홀수의 곱을 저장할 변수

        //1~n까지 반복
        for (int i = 1; i <= n; i++) {
            //홀짝 여부 판별
            if(i % 2 == 0){
                //짝수일 경우
                sum += i;
            } else {
                //홀수일 경우
                mul *= i;
            }
        }
        System.out.println(sum + " "  + mul);

        sc.close();

    }
}
