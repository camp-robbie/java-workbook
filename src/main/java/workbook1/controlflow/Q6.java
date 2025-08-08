package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // TODO: 1~n까지 중 자리수 합이 5의 배수인 수의 개수 출력
        int count = 0;                  //개수의 변수를 미리 선언
        for(int i =1; i<=n; i++){       //1부터 n까지 반복하기
            int sum = 0;                //자릿수 합 변수 sum = 0으로 초기화
            int temp = i;               //주어진 n값을 (지금은 i) 계산용 변수 temp에 넣어주기
            while(temp>0){              //temp의 자릿수 합 구하는 반복문
                sum += temp%10;         //temp의 마지막 자릿수를 sum에 더하기
                temp = temp/10;         //마지막 자릿수를 뺀 숫자를 temp에 할당하기. temp이 0이 되면 자릿수 합 구하는 반복문 종료.
            }
            if(sum % 5 == 0){           //자릿수 합이 5의 배수면
                count ++;               //count 증가
            }
        }
        System.out.println(count);
        sc.close();
    }
}