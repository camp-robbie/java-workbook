package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: 0이 나올 때까지 양수만 합산하는 코드 작성

        //양수의 합 저장할 변수
        int sum = 0;
        //반복문 작성
        while(true){
            //정수 입력 받고
            int a = sc.nextInt();
            //입력받은 정수가 0일 경우 종료
            if(a==0){
                break;
            }
            //입력받은 정수가 양수일 경우
            if(a>0){
                sum+=a;//sum에 합하기
            }
        }
        System.out.println(sum);

        sc.close();
    }
}