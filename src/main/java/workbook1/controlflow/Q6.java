package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // TODO: 1~n까지 중 자리수 합이 5의 배수인 수의 개수 출력
        // 1부터 N까지의 수에서 각 숫자의 자릿수 합이 5의 배수인 수의 개수를 세는 프로그램을 작성하시오.
        // 반복문과 조건문을 조합하여 자리수 합이 5로 나누어떨어지는 수를 찾습니다.

        int count = 0; // 개수

        for(int i = 1; i <= n; i++){
            int num = i;
            int sum = 0;

            while(num > 0){
                sum += num % 10; // 나머지 수(마지막 자리 수) sum에 합산
                num /= 10; // 마지막 자리 수(1의 자리) 제거
            }

            if(sum % 5 == 0){ // 합이 5의 배수인지 확인
                count++;
            }
        }
        System.out.println(count); // 출력
    }
}
// 출력 결과가 3으로 나옴
// 직접 계산해 본 결과 : 5, 14, 19 (총 3개)