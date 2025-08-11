package main.java.workbook2.methods;

import java.util.Scanner;

public class Q4 {
    // TODO: 세 정수의 평균을 반환하는 average 메서드 작성
    // 세 개의 정수를 매개변수로 받아 평균을 실수형으로 반환하는 메서드를 작성하고, 이를 호출하여 출력하는 프로그램을 작성하시오.
    // 메서드 이름은 average, 매개변수는 세 개의 int, 반환형은 double로 합니다.
    public static double average(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // TODO: average 호출 후 결과 출력
        double result = average(a, b, c);
        System.out.println(result);
    }
}
