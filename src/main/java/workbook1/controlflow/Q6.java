package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // TODO: 1~n까지 중 자리수 합이 5의 배수인 수의 개수 출력

        //자릿수의 합이 5의 배수인 숫자의 갯수 저장할 변수
        int count = 0;
        //1~n까지 반복
        for (int i = 1; i <= n; i++) {
            int sum = 0;//자릿수의 합
            int a = i;//임시 변수

            //자릿수의 합 구하는 연산
            while (a > 0) {
                sum += a % 10;
                a = a / 10;
            }
            //자릿수의 합이 5의 배수일 경우
            if ((sum % 5) == 0) {
                count = count + 1;//count에 1씩 추가
            }
        }
        //자릿수의 합이 5의 배수인 숫자의 갯수 출력
        System.out.println(count);
        sc.close();
    }
}