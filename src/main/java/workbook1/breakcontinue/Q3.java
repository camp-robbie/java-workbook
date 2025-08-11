package main.java.workbook1.breakcontinue;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        // TODO: 음수가 나오면 break, 양수 평균 출력
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int cnt = 0;
        while (true) {
            int input = sc.nextInt();
            if (input < 0) {
                System.out.println((double) sum / cnt);
                break;
            }
            sum += input;
            cnt++;
        }
    }
}