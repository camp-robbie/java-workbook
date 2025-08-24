package main.java.workbook3.overloading;

import java.util.Scanner;

public class Q2 {
    // TODO: max 메서드 오버로딩 (int,int)와 (int,int,int)
    // max 메서드 오버로딩 (int,int)
    public static int max(int a, int b) {
        if(a > b) {                 // a가 b보다 크다면
            return a;               // a를 반환함
        }
        return b;                   // b를 반환함
    }

    // max 메서드 오버로딩 (int,int,int)
    public static int max(int a, int b, int c) {
        if (a >= b && a >= c) {         // a가 b와 c보다 크거나 같다면 (두 조건 모두 만족해야 함)
            return a;                   // a를 반환함
        } else if (b >= a && b >= c) {  // 그렇지 않고, b가 a와 c보다 크거나 같다면 (두 조건 모두 만족해야 함)
            return b;                   // b를 반환함
        }
        return c;                       // c를 반환함
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 스캐너 열기
        int a = sc.nextInt();                   // a의 값을 입력받음
        int b = sc.nextInt();                   // b의 값을 입력받음
        int c = sc.nextInt();                   // c의 값을 입력받음

        // TODO: max 메서드 작성 후 아래 주석 해제
         System.out.println(max(a,b));          // max(a,b)의 결과를 출력함
         System.out.println(max(a,b,c));        // max(a,b,c)의 결과를 출력함

        sc.close();                             // 스캐너 닫기
    }
}