package main.java.workbook1.operators;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // TODO: a += b * c 연산 후 a, b, c 출력

        a += b * c;     // a = a + (b * c)랑 같음. b와 c를 곱한 다음 a를 더한 결과를 a에 저장함

        System.out.printf("%d %d %d", a, b, c);     // 결과를 확인하기 위해 출력함
    }
}
