package main.java.workbook1.breakcontinue;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: 음수가 나오면 break, 양수 평균 출력
        int sum = 0;
        int count = 0;
        int number;

        System.out.println("정수를 입력하세요 (음수가 입력되면 종료):");

        while (true) {
            try {
                number = sc.nextInt();

                if (number < 0) {
                    break;
                }

                sum += number;
                count++;
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 정수를 다시 입력하세요.");
                sc.next();
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println(average);
        } else {
            System.out.println("입력된 양수가 없습니다.");
        }
    }
}