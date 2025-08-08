package main.java.workbook1.loops;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // TODO: do-while 문으로 3의 배수의 합 계산 후 출력

        int sum = 0;
        int i = 3;

        do {
            // 여기서부터 반복 실행할 코드
            sum += i;
            i += 3;
        } while (i <= n); // 반복 조건, 참일시 다시 do 로 돌아감. 거짓이면 종료.

        System.out.println(sum);
    }

}
