package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // TODO: a, b, c 중 최대값 또는 같은 값 여부 출력

        if (a == b || a == c || b == c) {
            System.out.println("같은 수 존재");  // 같은 값이 있는 경우 "같은 수 존재" 출력
        } else {
            // a가 b보다 큰 경우(조건문)
            if(a > b){

                // [ a > b, a > c ]  => a가 제일 큼
                if(a > c){
                    System.out.println(a);  // 가장 큰 값인 a 출력

                // [ a > b, a < c ]  -> [ c > a > b ]  => c가 제일 큼
                } else {
                    System.out.println(c); // 가장 큰 값인 c 출력
                }

            // a가 b보다 크지 않은 경우(조건문)
            } else {

                // [ a < b, b > c ]  => b가 제일 큼
                if (b > c) {
                    System.out.println(b);  // 가장 큰 값인 b 출력

                // [ a < b, b < c ]  -> [ c > b > a ]  => c가 제일 큼
                } else{
                    System.out.println(c);  // 가장 큰 값인 c 출력
                }
            }
        }
    }
}