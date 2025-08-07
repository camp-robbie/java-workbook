package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // TODO: a와 b를 double로 자동 형변환하여 더한 뒤 int로 강제 변환하여 출력

        // 자동 형변환(정수→실수)과 강제 형변환(실수→정수)을 모두 사용하기
        // 자동 형변환(int → double)
        double sum = a + b;                      // a와 b가 double형으로 자동 형변환되어 덧셈 수행
        System.out.println("sum = " + sum);      // double형으로 형변환이 제대로 적용이 되었는지 확인하기 위해서 출력함

        // 강제 형변환(double → int) 확인
        int result = (int)sum;                      // double형으로 저장된 sum을 int형으로 변환함
        System.out.println("sum = " + (int) sum);   // int형으로 형변환이 제대로 적용되었는지 확인하기 위해서 출력함
    }
}