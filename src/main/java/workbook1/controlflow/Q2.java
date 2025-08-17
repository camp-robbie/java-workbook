package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        // TODO: count개의 정수를 입력받아 양수 개수와 음수 합을 계산 후 출력

        // 스캐너를 통해 숫자를 입력 받는다
        Scanner sc = new Scanner(System.in);
        System.out.print("Counts : ");
        int count = sc.nextInt();

        int positiveCounts = 0;
        int negativeSum = 0;

       for (int i = 0; i < count; i++) {
           int numbers = sc.nextInt();

           if (numbers > 0) {
               positiveCounts++;
           } else if (numbers < 0) {
               negativeSum += numbers;
           }
       }
        System.out.println(positiveCounts + " " + negativeSum);

       // 갯수를 세는 코드를 몰라 답지를 보고 적었습니다 (positiveCounts++)

    }
}