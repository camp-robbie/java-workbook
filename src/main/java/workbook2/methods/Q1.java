package main.java.workbook2.methods;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(sum(a,b));
    }
    // 이 메서드가 static인 이유는
    // 이 메서드를 사용하는 main 이 static 이기 때문입니다.
    // static 메서드는 static이 아닌 메서드/필드를 참조할 수 없습니다.
    static int sum(int a, int b){
        return a+b;
    }
}
