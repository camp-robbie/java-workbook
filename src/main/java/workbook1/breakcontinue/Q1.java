package main.java.workbook1.breakcontinue;

public class Q1 {
    public static void main(String[] args) {
        // TODO: 1부터 순차적으로 더하다가 10의 배수를 만나면 break
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 0) {
                System.out.println(sum);
                break;
            } else {
                sum += i;
            }
        }
    }
}