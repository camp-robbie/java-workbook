package main.java.workbook1.breakcontinue;

public class Q1 {
    public static void main(String[] args) {
        int sum = 0;
        // TODO: 1부터 순차적으로 더하다가 10의 배수를 만나면 break

        for (int i = 1; i <= 10; i++) {
            sum += i;

            if (i % 2 == 0) {
                break;
            }
        }
        System.out.println(sum);
    }
}