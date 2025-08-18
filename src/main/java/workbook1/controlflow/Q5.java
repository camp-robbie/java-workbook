package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // TODO: 각 자리수의 합을 반복해 한 자리 수가 될 때까지 계산 후 출력

        while (num >= 10) {
            int sum =0;

            // 10으로 나누는 걸 반복하며 각자리 수를 더함
            while (num > 0) {
                sum += num % 10; // 마지막 자리수 더하기
                num /= 10; // 위에서 더한 자리수 제거
            }

            num = sum;
        }
        System.out.println(num);

    }
}