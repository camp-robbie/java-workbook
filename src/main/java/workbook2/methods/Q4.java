package main.java.workbook2.methods;

import java.util.Scanner;

public class Q4 {
    // TODO: 세 정수의 평균을 반환하는 average 메서드 작성
    // 메서드 이름은 average, 매개변수는 세 개의 int, 반환형은 double
    public static double average(int a, int b, int c) {
        return ((double)(a + b + c)) / 3;        // double형으로 변환해주고 계산해야 소수점 안버려짐
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // TODO: average 호출 후 결과 출력
        System.out.println(average(a, b, c));
    }
}
