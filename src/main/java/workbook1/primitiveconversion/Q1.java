package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 첫번째 입력 값
        int b = sc.nextInt(); // 두번째 입력 값

        double result = a + b; // a와 b의 연산 결과가 double result라는 변수에 담겨지면서 자동으로 double로 형변환 됩니다.

        int resultNum = (int) result; //double인 result를 다시 int로 강제 형변환 합니다.

        System.out.println(resultNum); // 결과 값을 출력합니다.
    }
}