package main.java.workbook1.breakcontinue;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: 음수가 나오면 break, 양수 평균 출력
        int count = 0;                  // 양수 개수  (초기값 : 0)
        double sum = 0;                 // 양수 합계  (초기값 : 0)

        while (true){
            int n = sc.nextInt();          // 정수 입력받기
            if(n < 0){                     // 음수이면
                break;                     // 반복문 종료

            }if(n == 0) {                  // n이 0일 경우
                continue;                  // 해당 반복 건너뛰고 다음 반복 진행
            }
            count++;                       // 양수 개수(count) 1 증가
            sum += n;                      // 양수 합산
        }

        // count 예외 처리
        if (count == 0){
            System.out.println("평균을 계산할 양수가 없습니다.");
        }else{
            System.out.println(sum/count);  // 양수 평균값 출력
        }
    }
}