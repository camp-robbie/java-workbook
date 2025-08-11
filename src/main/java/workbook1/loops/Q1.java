package main.java.workbook1.loops;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // int i -> 반복문이 돌아가는 횟수입니다.
        // int sum -> 수를 더해서 저장하는 변수입니다.
        int i = 1;
        int sum = 0;

        // while -> i가 입력값 이하인 동안에만 반복합니다.
        // i가 하나씩 늘고, 결국 입력값과 같아질 때까지 sum에 더해줍니다.
        while (i<=n) {
            sum += i;
            i++;
        }

        // 출력합니다.
        System.out.println(sum);
    }
}


