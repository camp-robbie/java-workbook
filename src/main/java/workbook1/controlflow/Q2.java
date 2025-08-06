package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        //음수의 합 변수 초기화
        int negativeSum = 0;
        //양수의 갯수 변수 초기화
        int countNum = 0;

        //count개의 정수를 입력받기
        for(int i = 1; i <= count; i++){
            int num = sc.nextInt();
            if (num < 0){                   //음수일 경우
                negativeSum += num;         //음수 합 변수에 더하기
            }else{                          //양수일 경우
                countNum++;                 //양수 갯수 세기
            }
        }
        //양수 개수와 음수 합을 계산 후 출력
        System.out.println(countNum +" "+ negativeSum);
    }
}