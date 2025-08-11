package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // TODO: 1~n까지의 소수를 찾아 출력

        //1은 소수가 아니므로 2~n까지 소수 여부 판별
        for (int i = 2; i <= n; i++) {

            //소수 판별 결과 변수 선언
            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) { //2~i의 제곱근까지의 수 중 나눠지는 수가 있는지 검사
                if (i % j == 0) {
                    //나눠지는 수가 있는 경우
                    isPrime = false;//소수가 아님
                    break;//해당 수는 소수가 아니므로 반복문 break
                }
            }
            //연산이 여기까지 진행됐다 -> 소수이므로 출력
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}