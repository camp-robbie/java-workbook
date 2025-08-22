package main.java.workbook1.breakcontinue;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: 음수가 나오면 break, 양수 평균 출력

        // 양수 합계를 저장할 변수 생성
        // 양수 평균을 계산할 변수 생성
        // 평균 계산을 위해 양수 개수를 저장할 변수 생성
        // 조건문을 사용해서 음수가 나오면 break

        int sum = 0;
        int count = 0;

        while (true) {

            int numbers = sc.nextInt();
            if (numbers < 0) {
                break;
            }
            sum += numbers;
            count++;
        }
        double average = (double) sum / count;
        System.out.println(average);
    }
}