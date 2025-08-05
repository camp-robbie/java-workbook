package main.java.workbook1.operators;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        // TODO: x와 y 중 큰 값에 5를 곱해 출력
        // 삼항연산자를 사용하여 큰 값을 비교하고, x > y가 참일 경우에는 x * 5, 거짓일 경우에는 y * 5가 실행되어 result에 결과가 저장됨
        int result = (x > y) ? x * 5 : y * 5;

        System.out.println(result);     // 결과를 확인하기 위해서 출력함
    }
}