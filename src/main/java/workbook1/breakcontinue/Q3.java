package main.java.workbook1.breakcontinue;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: 음수가 나오면 break, 양수 평균 출력
        int count = 0;              //n의 갯수를 구할 변수 선언
        double sum = 0.0;           //n의 합계를 구할 변수 선언
        while(true){
            int n = sc.nextInt();   //반목문 돌면서 계속 n값 입력받기
            if(n<0){                //n이 음수면
                break;              //반복문 중단
            }
            sum += n;               //n이 양수일 경우 n을 합계 sum에 더하기
            count++;                //n의 갯수 구하기
        }
        double avg = sum/count;     //평균 구하기
        System.out.println(avg);    //평균 출력
    }
}