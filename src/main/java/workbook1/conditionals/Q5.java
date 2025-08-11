package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // 같은 수가 존재한다면
        // &&를 사용하지 않은 이유 => &&를 사용할 경우, 최악의 경우 조건 확인을 4번 해야 함.
        // 아래 코드는 최악의 경우 조건 확인이 3번까지입니다.
        if(a==b || b==c || c==a){
            System.out.println("같은 수 존재");
        } else if(a>b){
            // a가 b보다 크다면
            if (a>c){
                // a가 b보다 크고, c보다 크다면
                System.out.println(a);
            }else {
                // a가 b보다 크고 c보다 작으면
                System.out.println(c);
            }
        } else {
            // b가 보다 크면
            if (b>c){
                // b가 a보다 크고, c보다 크면
                System.out.println(b);
            } else {
                // b가 a보다 크고, c보다 작으면
                System.out.println(c);
            }
        }

        /*
        // 아주아주 간단하게 끝내는 법
        if(a==b || b==c || c==a){
            System.out.println("같은 수 존재");
        }else {
            System.out.println(Math.max(a,Math.max(b,c)));
        }
        */
    }
}