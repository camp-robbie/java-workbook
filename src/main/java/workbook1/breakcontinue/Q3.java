package main.java.workbook1.breakcontinue;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: 음수가 나오면 break, 양수 평균 출력

        int sum = 0;
        int count = 0;

        while (true) {
            int num = sc.nextInt();

            if (num < 0) {
                break;
            }
            sum += num;
            count++;
        }
        if (count > 0) {
            double avg = (double) sum / count;  // 형변환 주의
            System.out.println(avg);
        } else {
            return;
        }

        sc.close();

    }
}