package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // TODO: a, b, c 중 최대값 또는 같은 값 여부 출력

        //세 숫자 중에서 같은 수 존재 여부 파악
        if (a == b || a == c || b == c) {
            System.out.println("같은 수 존재");
        } else {
            //a,b,c 비교 출력 로직 작성
            if(a>b && a>c){
                System.out.println(a);
            } else if(b>c){
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        }
        sc.close();
    }
}