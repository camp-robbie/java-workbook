package main.java.workbook3.varinit;

class InitDemo {
    int a = 10;
    int b;
    {
        // TODO: b 초기화
        b = 20;
    }
    InitDemo () {
        // TODO: a와 b의 합 출력
        int sum = this.a + this.b;
        System.out.println("합 : " + sum);
    }
}

public class Q1 {
    public static void main(String[] args) {
        new InitDemo();
    }
}
