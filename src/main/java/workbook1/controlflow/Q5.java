package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // TODO: 각 자리수의 합을 반복해 한 자리 수가 될 때까지 계산 후 출력

        int temp = 0;              // 자리수 합을 임시 저장할 변수 temp 선언 (초기값 : 0)

        while (true) {             // break 할 때까지 무한 반복 (내부 조건 만족시까지)
                temp += num % 10;  // [ num % 10 -> 마지막 자리 ] temp에 합산
                num /= 10;         // [ num / 10 -> 마지막 자리 제외한 숫자 ] num에 대입
                if (num == 0) {    // 한 라운드(자리수의 합)가 끝난 경우
                    num = temp;    // 각 자리수 합을 num에 대입
                    temp = 0;      // 임시값 temp 초기화
                    if (num < 10){ // 각 자리수 합이 한 자리 수가 되면
                        break;     // 반복문 종료
                    }
                }
        }
        System.out.println(num);   // 각 자리수의 합이 한 자리 수가 되면 num 출력
    }
}

/* while (num < 10) 이렇게 진행했더니
   num 값이 10보다 작아지기만 하면 종료되어버림.
   즉, temp 값과 더해지기 전에 num 값만 보고 종료.
     ex. temp=3 / num=8 이 경우 temp =11 로 합산되어
         다시 반복문을 돌아야 하는데 8로 그냥 종료되어버림

   => while(true)
      break로 종료시점 정할 수 있음

   ## 정리 ##
   1. while(조건)
      - 조건 간단
      - 반복 시작 전 검사해도 타이밍 문제 없는 경우

   2. while(true) + break
      - 종료 조건 복잡
      - 반복 도중 특정 시점에만 종료해야 하는 경우

   참고) 타이밍 문제 : 위 처럼 temp 합산 되기 전에 종료되어 버리는 경우

 */