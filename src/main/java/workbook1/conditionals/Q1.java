package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // TODO: num의 부호를 판단하여 출력

        //if - else if - else문을 사용하여 음수, 0, 양수 출력
        if (num < 0) {
            System.out.println("음수");
        } else if (num == 0) {
            System.out.println("0");
        }  else {
            System.out.println("양수");
        }
        sc.close();
    }
    }
