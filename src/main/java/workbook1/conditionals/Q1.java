package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // TODO: num의 부호를 판단하여 출력
        // 정수를 입력받아 음수, 0, 양수를 구분하여 각각 “음수”, “0”, “양수”를 출력하는 프로그램을 작성하시오.
        // if-else if-else 문을 사용
        if (num < 0) {
            System.out.print("음수");
        }  else if (num == 0) {
            System.out.print("0");
        }  else {
            System.out.print("양수");
        }
    }
}
