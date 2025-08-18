package main.java.workbook1.breakcontinue;

public class Q2 {
    public static void main(String[] args) {
        // TODO: 1~10 사이의 홀수만 출력하도록 continue 사용

        for (int i = 1; i <= 10; i++){
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i + " ");
        }
    }
}
