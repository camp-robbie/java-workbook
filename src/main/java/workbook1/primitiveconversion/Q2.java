package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble(); // 입력 값

        double result; // 연산 결과를 담을 변수

        int newNum = (int) d; // double d를 강제로 int 형변환

        result = d-newNum; // (double) result = (double) d - (int) newNum

        System.out.println(result); // result는 double 이기 때문에 결과 값을 소수점까지 표시 가능
    }
}