package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        //윤년 판별 로직 구현
        if(  ((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)  ){
            System.out.println("윤년");
        } else {
            System.out.println("평년");
        }
    }
}
