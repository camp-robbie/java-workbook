package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        // TODO: count개의 정수를 입력받아 양수 개수와 음수 합을 계산 후 출력

        int positiveCount = 0;
        int negativeSum = 0;

        // 첫 번째 시도 = 출력 값이 틀림
//        for (int i = 0; i < count; i++) {
//            int num = sc.nextInt();
//            if (num > 0) {
//                positiveCount++;
//            } else if (num < 0) {
//                negativeSum += num;
//            }
//        }
//        System.out.println(positiveCount + negativeSum);

        // 두 번째 시도 - 출력문 수정해서 성공!
        for (int i = 0; i < count; i++) {
            int num = sc.nextInt();
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeSum += num;
            }
        }
        System.out.println(positiveCount + " " + negativeSum);
    }
}