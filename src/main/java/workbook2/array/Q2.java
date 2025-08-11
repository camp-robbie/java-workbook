package main.java.workbook2.array;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        // TODO: arr에 값 저장 후 최대값과 최소값 출력

        System.out.println("10개의 실수를 입력하세요.");
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("min : " + min + " max : " + max);
        sc.close();
    }
}
