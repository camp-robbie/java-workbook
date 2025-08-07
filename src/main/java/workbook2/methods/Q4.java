package main.java.workbook2.methods;

import java.util.Scanner;

public class Q4 {
    // TODO: 세 정수의 평균을 반환하는 average 메서드 작성
    public static double average(int a, int b, int c){
        return (double)(a+b+c)/3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // TODO: average 호출 후 결과 출력
        double average = average(a,b,c);
        System.out.println(average);
        sc.close();
    }
}
