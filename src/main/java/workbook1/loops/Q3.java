package main.java.workbook1.loops;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //do-while 문으로 3의 배수의 합 계산
        int i = 3;      //int i =3 초기값 3으로 설정
        int sum = 0;    //3의 배수 합 초기값 0으로 설정
        do{
            sum += i;   //합계 변수에 3 더하기
            i = i+3;    //i를 3씩 증가시켜 3의 배수 더하기
        }
        while(i <= n);  //i가 n보다 크거나 같으면 반복문 종료
        //출력
        System.out.println(sum);
    }
}
