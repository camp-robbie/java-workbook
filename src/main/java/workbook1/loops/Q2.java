package main.java.workbook1.loops;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 홀수의 합계와 짝수의 합계를 저장하는 변수를 선언합니다.
        int oddSum = 0;
        int evenSum = 0;

        // for(인덱스 선언; 조건식; 증감식){코드}
        // 홀수 <- i를 1로 선언하고, 2씩 더해줍니다.
        for(int i=1;i<=n;i+=2){
            oddSum += i;
        }
        // 짝수 <- i를 2로 선언하고, 2씩 더해줍니다.
        for(int i=2;i<=n;i+=2){
            evenSum += i;
        }

        // 출력합니다.
        System.out.println(oddSum+" "+evenSum);
    }
}
