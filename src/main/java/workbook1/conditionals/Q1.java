package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        // if를 2번 사용하는 구문입니다.
        if(num>=0){
            if (num==0){
                System.out.println("0");
            }else {
                System.out.println("양수");
            }
        }else {
            System.out.println("음수");
        }
    }
}
