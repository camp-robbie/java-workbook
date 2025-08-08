package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // TODO: 1~n까지 중 자리수 합이 5의 배수인 수의 개수 출력

        int count = 0;                   // 최종 개수(자리수 합의 한자리 결과가 5의 배수인 수)

        //1. for문
        for (int i = 1; i <= n; i++) {   // 1 ~ n 까지 수 검사
           int num = i;                  // 계산을 위한 변수 num 선언 및 초기화 (초기값 i)

           //2. while문
           while (num >= 10) {           // num이 10 이상이면 반복문 수행
                                         //    -> 10 미만은 if문(5의 배수 검증)만 수행
               int temp = 0;             // 계산 값을 저장할 임시 변수 temp 선언 및 초기화 (초기값 0)

               while (num > 0) {         // num이 0 이하되면(num = 한자리수) while문 종료
                   temp += num % 10;     // [ num % 10 -> 마지막 자리 ] temp에 합산
                   num /= 10;            // [ num / 10 -> 마지막 자리 제외한 숫자 ] num에 대입
               }
               num = temp;               // num이 한자리 수가 되면 저장된 temp값 대입 후 while문 탈출
           }

           //3. if문
           if(num % 5 == 0){             // 자리수 합이 5의 배수인지 검증 -> num이 10 미만 시 수행
               count++;                  // 5의 배수이면 count 1 증가
           }
        }
        System.out.println(count);        // 1~n까지 중 자리수 합이 5의 배수인 개수 출력
    }
}

/*
   1. for문 = 1 ~ n까지 모든 수 검증
   2. while문 = 각 자리 수 더해 한자리 수 만들기
   3. if문 = 5의 배수인지 검증 후 카운트 -> 반드시 한자리수만 검증 가능!
*/
