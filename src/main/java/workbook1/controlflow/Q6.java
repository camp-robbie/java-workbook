package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // TODO: 1~n까지 중 자리수 합이 5의 배수인 수의 개수 출력
        // 1부터 N까지의 수에서 각 숫자의 자릿수 합이 5의 배수인 수의 개수를 세는 프로그램
        // 반복문과 조건문을 조합하여 자리수 합이 5로 나누어떨어지는 수 찾기

        int count = 0;     // 개수를 구하기 위한 변수
        for(int i = 1; i <= n; i++) {   // i는 1이고, n보다 같거나 작을 때까지 1씩 증가시키며 반복 수행
            int myNum = i;              // myNum에 i를 대입함 (i를 그냥 사용하게 되면 i 값이 바뀌게 되어 반복문이 제대로 수행 안됨)
            int sum = 0;                // 합계를 계산할 변수

            while(myNum > 0) {          // myNum이 0보다 클 동안 반복함
                int endI = myNum % 10;  // myNum을 10으로 나눈 나머지를 endI에 저장함
                sum += endI;            // sum = sum + endI;
                myNum /= 10;            // myNum = myNum / 10;
            }
            if(sum % 5 == 0) {          // sum이 5로 나누어 떨어진다면
                count++;                // count 증가
            }
        }
        System.out.println(count);      // 개수를 출력함

    }
}