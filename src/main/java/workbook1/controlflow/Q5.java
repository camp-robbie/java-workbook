package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        // TODO: 각 자리수의 합을 반복해 한 자리 수가 될 때까지 계산 후 출력
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while (num >= 10) {
            int sum = 0;
            String str = Integer.toString(num);  // 숫자를 문자열로 변환

            for (int i = 0; i < str.length(); i++) {
                sum += Integer.parseInt(str.substring(i, i + 1));
                // 한 글자씩 떼서 숫자로 치환하여 더함
            }
            num = sum;
        }
        System.out.println(num);
    }
}