package main.java.workbook1.loops;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // TODO: while 문을 이용하여 1부터 n까지의 합 출력

        //1~n까지 합계를 저장할 변수 선언
        int sum = 0;
        //1~n까지 숫자를 셀 변수 선언
        int i = 1;

        //while문을 이용하여 i가 입력한 숫자 n과 같아질 때 까지 반복
        while (i <= n) {
            sum += i;
            i++;
        }

        System.out.println(sum);

        sc.close();
    }
}

