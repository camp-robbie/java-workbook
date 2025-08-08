package main.java.workbook1.breakcontinue;

public class Q1 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i < 100; i++) {
            if(i % 10 == 0) {
                break;
            }
            sum = sum + i;
        }
        System.out.print(sum);
        // TODO: 1부터 순차적으로 더하다가 10의 배수를 만나면 break
        // 합을 출력
    }
}