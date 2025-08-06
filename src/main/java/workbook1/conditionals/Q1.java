package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        // TODO: num의 부호를 판단하여 출력
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

//        if (num == 0){
//            System.out.println("0");
//        } else if (num < 0) {
//            System.out.println("음수");
//        } else {
//            System.out.println("양수");
//        }

        String result = num == 0 ? "0" : (num > 0 ? "양수" : "음수");
        System.out.println(result);
    }
}
