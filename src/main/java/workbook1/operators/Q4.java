package main.java.workbook1.operators;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 정수를 입력하세요 : ");
        int a = sc.nextInt();
        System.out.println("두 번째 정수를 입력하세요 : ");
        int b = sc.nextInt();
        System.out.println("세 번째 정수를 입력하세요 : ");
        int c = sc.nextInt();
        // TODO: b가 a보다 크고 c보다 작은지 평가하여 출력

        boolean gt = a < b && b < c;
        System.out.println("b가 a보다 크고 c보다 작은가요? : (" + gt + ")결과입니다.");
    }
}