package main.java.workbook1.loops;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // TODO: do-while 문으로 3의 배수의 합 계산 후 출력

        int num = 1;   // 시작 숫자 num 선언 및 초기화 (num은 1부터 시작)
        int sum = 0;   // 3의 배수 합을 저장할 sum 변수 선언 및 초기화

        // do-while 구문 사용
        // do = 무조건 1번 이상 실행
        do{
            if(num % 3 == 0){    // num 이 3의 배수이면

                sum += num;      // sum에 num을 합산!
            }
            num++;               // num값을 1증가

        }while(num <= n);        // num이 n 초과시 반복분(do) 종료 -> 반복조건

        System.out.println(sum); // 3의 배수의 합 출력

    }
}
