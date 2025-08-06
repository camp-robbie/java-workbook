package main.java.workbook1.operators;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int firstNum = ++num;     // 전위 증가 결과를 저장하는 변수
        int secondNum = num++;    // 후위 증가 결과를 저장하는 변수

        System.out.println(firstNum + " " + secondNum);    // 전위 증가 결과와 후위 증가 결과를 출력하여 결과를 확인함
    }
}
