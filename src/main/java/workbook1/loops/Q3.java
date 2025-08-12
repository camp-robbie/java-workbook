package main.java.workbook1.loops;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        // TODO: do-while 문으로 3의 배수의 합 계산 후 출력

        // 사용자의 입력을 받는다.
        Scanner sc = new Scanner(System.in);
        System.out.print("Num: ");
        int n = sc.nextInt();

        // 합계를 저장할 변수, 시작 숫자 초기화 변수 생성
        int sum = 0;
        int i = 1;

        do {
            if (i % 3 == 0) {
                sum += i;
            }
            i++;
        } while (i <= n);

        System.out.println(sum);

    }
}
