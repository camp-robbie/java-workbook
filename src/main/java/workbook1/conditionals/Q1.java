package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        // if를 2번 사용하는 구문입니다.
        if(num==0){
            System.out.println(0);       // num이 0이라면 0을 출력
        }else if(num<0){
            System.out.println("음수");   // num이 0보다 작다면 음수를 출력
        }else {
            System.out.println("양수");   // 0도 아니고, 0보다 작지도 않다면 양수를 출력
        }
    }
}
