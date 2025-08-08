package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while (num >= 10) {
            int sum = 0;
            int tempNum = num;                          //가독성과 안정성을 위해 새로운 변수tempNum에 num을 담아주기(+num 보존 위해)
            while (tempNum > 0) {                       //자릿수의 합(sum)구하는 반복문
                sum += tempNum % 10;                    //맨 마지막 자릿수 구해서 sum에 더하기
                tempNum = tempNum / 10;                 //맨 마지막자릿수를 뺀 숫자를 tempNum에 할당
            }
            num = sum;                                  //자릿수 합을 다시 num에 할당한 후 반복문 돌리기
        }
        System.out.println(num);                        //num이 한자릿수 일 때 반복문은 종료되고 그 num값을 출력
        sc.close();                                     //스캐너 닫아주기
    }
}