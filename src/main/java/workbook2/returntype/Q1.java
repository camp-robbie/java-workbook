package main.java.workbook2.returntype;

import java.util.Scanner;

public class Q1 {
    // 조건 : 메서드 반환 타입은 int임.
    public static int add (int a, int b){
        return a+b;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        // 출력합니다.
        // 아래 출력문에서 하는 작업 :
        // 메서드 파라미터로 a와 b를 넘긴 후,
        // return된 값을 String(문자열) 로 변환하여 출력합니다.
        System.out.println(add(a,b));
    }
}