package main.java.workbook1.loops;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // TODO: while 문을 이용하여 1부터 n까지의 합 출력

        int i = 1;
        int sum = 0; // 합계를 저장하는 변수 설정

        // i 가 n 초과가 될 때까지 반복
        while (i <= n) {
            sum += i; // sum = sum+i
            i++;
        }

        System.out.println(sum);
    }
}


