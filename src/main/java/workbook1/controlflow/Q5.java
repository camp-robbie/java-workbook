package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // TODO: 각 자리수의 합을 반복해 한 자리 수가 될 때까지 계산 후 출력

        //합이 한 자리 수가 될 때까지 반복
        while (num >= 10) {
            int sum = 0;//합을 저장할 변수
            int i = num;//임시 변수

            //i의 모든 자릿수를 더하는 반복문
            while (i > 0) {
                sum += i % 10;//마지막 자릿수를 구하고 sum에 더하기
                i = i / 10;//마지막 자릿수 제거
            }
            //합이 두 자릿수가 될 때까지 반복해야하므로 num에 sum을 저장
            num = sum;
        }
        //한 자릿수가 된 num 출력
        System.out.println(num);
        sc.close();
    }
}