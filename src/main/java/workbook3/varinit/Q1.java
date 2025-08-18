package main.java.workbook3.varinit;

import java.sql.SQLOutput;

class InitDemo {
    int a = 10;
    int b;
    {
        // TODO: b 초기화
        b = 20 ;
    }
    InitDemo() {
        // TODO: a와 b의 합 출력
        System.out.println(a + b);
    }
}

public class Q1 {
    public static void main(String[] args) {
        new InitDemo();
    }
}
