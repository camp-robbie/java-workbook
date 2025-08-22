package main.java.workbook1.breakcontinue;

public class Q2 {
    public static void main(String[] args) {
        // TODO: 1~10 사이의 홀수만 출력하도록 continue 사용

        // 반복문을 사용해서 1부터 10까지의 숫자를 출력한다.
        // % 연산자를 사용해서 홀수인지 짝수인지 확인한다.
        // 짝수면 continue를 하고 홀수면 출력한다.

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
