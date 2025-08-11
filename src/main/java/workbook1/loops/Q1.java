package main.java.workbook1.loops;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // TODO: while 문을 이용하여 1부터 n까지의 합 출력

        int num = 1; // 시작 숫자 num 선언 및 초기화
        int sum = 0; // 합계를 저장할 sum 선언 및 초기화

        // while 문 루프
        while(num <= n){   // num 이 n 보다 같거나 작을 때까지 반복!
            sum += num;   // sum = sum + num  => 현재 num 값을 sum에 합산
            num++; // num 을 1씩 증가 => 없으면 무한 반복 발생
        }

        System.out.println(sum); // 1부터 N까지의 합 출력

    }
}


