package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        // TODO: 0이 나올 때까지 양수만 합산하는 코드 작성
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (true) {
            int num = sc.nextInt();
            if (num == 0) {
                break;  // 0 입력되면 종료
            }
            if (num > 0) {
                sum += num;  // 양수만 합산
            }
        }

        System.out.println(sum);
    }
}