package main.java.workbook2.methods;

import java.util.Scanner;

public class Q1 {
    // TODO: 두 정수를 더해 반환하는 sum 메서드를 작성하세요.

    //두 정수를 받아 합을 반환하는 메서드
    public static int sum(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // TODO: sum 메서드를 호출하여 결과 출력
        System.out.println(sum(a,b));
        sc.close();
    }
}
