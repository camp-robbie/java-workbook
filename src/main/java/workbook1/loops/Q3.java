package main.java.workbook1.loops;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // TODO: do-while 문으로 3의 배수의 합 계산 후 출력
        int sum = 0;    // 합계를 구할 변수
        int i = 3;      // 3부터 더하기 위해 i를 3으로 초기화
        do {
            sum += i;   // sum = sum + i;
            i += 3;     // i = i + 3;
        } while (i <= n);   // i가 n보다 작거나 같은 동안 반복 수행

        System.out.println(sum);    // 결과를 확인하기 위해 출력함
    }
}
