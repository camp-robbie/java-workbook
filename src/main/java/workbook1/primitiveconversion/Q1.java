package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        // TODO: a와 b를 double로 자동 형변환하여 더한 뒤 int로 강제 변환하여 출력
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        double sum = a + b;
        // 명명에 따라 int에서 double로 넘어갈 때 자동으로 형변환이 이루어짐

        int result = (int) sum;
        // 이 역시 문제는 없으나 sum(double)은 int보다 큰 데이터를 담을 수 있으므로
        // 이 경우 데이터 양에 따라서 손실이 일어날 수 있음

        System.out.println(result);
    }
}