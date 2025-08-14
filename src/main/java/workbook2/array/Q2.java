package main.java.workbook2.array;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        // TODO: arr에 값 저장 후 최대값과 최소값 출력
        for(int i = 0; i < 10; i++) {
            arr[i] = sc.nextDouble();
        }

        double max = arr[0];
        double min = arr[0];

        for(int i = 0; i < 10; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        System.out.println(max + " " +min);
    }
}
