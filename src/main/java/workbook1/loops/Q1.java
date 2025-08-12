package main.java.workbook1.loops;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        // TODO: while 문을 이용하여 1부터 n까지의 합 출력

        // 숫자를 입력 받는다.
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int n = sc.nextInt();

        // 1부터 n까지의 합계를 저장할 변수를 만든다.
        // int i를 1로 설정하여 입력값 n보다 작거나 같을 때까지 계속 반복하며 더한 후 sum에 저장한다.
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;  // sum = sum + i
            i++;
        }
        System.out.println(sum);

    }
}


