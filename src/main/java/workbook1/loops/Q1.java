package main.java.workbook1.loops;


import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // while 문을 이용하여 1부터 n까지의 합 구하기
        int i = 1;      // int i 초기화
        int sum = 0;    //int sum 초기화
        while(i<=n){    //1부터 n까지 반복
            sum += i;   //sum에 i 더한 값 넣어주기
            i++;        //i 1씩 증가시키기
        }
        //출력
        System.out.println(sum);
    }
}


