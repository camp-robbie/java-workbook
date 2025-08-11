package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(true){                                //while반복문 실행

            int n = sc.nextInt();                   //정수입력 받기
            if(n > 0){                              //양의 정수면 변수 sum에 더하기
                sum += n;
            }else if(n == 0){                       //입력받은 정수 n이 0일 경우 while 반복문 종료
                break;
            }
        }
        System.out.println(sum);                    //양의 정수 더한 sum 출력
    }
}