package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("0 이상의 정수를 입력하세요: ");
        int num = sc.nextInt();
        // TODO: 각 자리수의 합을 반복해 한 자리 수가 될9 때까지 계산 후 출력
        while (num > 9) {
            int sum = 0;
            String numStr = String.valueOf(num);
            for (int i = 0; i < numStr.length(); i++) {
                sum += Character.getNumericValue(numStr.charAt(i));
            }
            num = sum;
        }
        System.out.println("최종 결과: " + num);
    }
}