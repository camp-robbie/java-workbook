package main.java.workbook2.array;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 입력 받을 준비
        double[] arr = new double[10];  // 배열 초기화 {0.0 ... 0.0} 준비
        // TODO: arr에 값 저장 후 최대값과 최소값 출력

        for (int i = 0; i < arr.length; i++) {  // 입력값 받기
            arr[i] = sc.nextDouble();
        }

        double max = arr[0];
        double min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.print(max + " " + min);

        System.out.println();

        sc.close();

    }
}
