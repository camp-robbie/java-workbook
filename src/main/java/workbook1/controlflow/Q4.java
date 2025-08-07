package main.java.workbook1.controlflow;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: 0이 나올 때까지 양수만 합산하는 코드 작성

        List<Integer> numbers = new ArrayList<>();

        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;
            numbers.add(n);
        }

        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            int num = numbers.get(i);
            if (num > 0 ) {
                sum += num;
            }
        }

        System.out.println(sum);

        sc.close();
    }
}