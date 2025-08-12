package main.java.workbook1.loops;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        // TODO: 홀수 합과 짝수 합 계산 후 출력

        // 사용자에게 숫자를 입력 받는다.
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int n = sc.nextInt();

        // 홀수와 짝수를 담을 변수를 만들어준다.
        int oddSum = 0;
        int evenSum = 0;

        // 반복문을 사용하여 짝수는 짝수끼리 홀수는 홀수끼리 더해서 변수에 저장한다.
        // (if문은 사용하지 않는다)

        for (int i = 1; i <= n; i+=2) {
            oddSum += i;
        }

        for (int j = 2; j <= n; j+=2) {
            evenSum += j;
        }

        System.out.println("oddSum = " + oddSum + " " + "evenSum = " + evenSum);

    }
}
