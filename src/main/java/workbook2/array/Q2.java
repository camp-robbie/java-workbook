package main.java.workbook2.array;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];

        // TODO: arr에 값 저장 후 최대값과 최소값 출력
        // 10개의 실수를 입력받아 배열에 저장하고, 배열의 최대값과 최소값을 출력하는 프로그램을 작성하시오.
        // 반복문을 사용하여 배열을 탐색하면서 최대, 최소를 구합니다.

        // 10개의 실수를 입력받아 배열에 저장
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextDouble();
        }

        double max = arr[0];
        double min = arr[0];

        // 최대, 최소를 구함
        for (int i = 1; i < 10; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            // 반복문 안에서 출력하여 최대값, 최소값이 아니고 전체 실수가 그대로 출력되는 오류 발생
//            System.out.print(max + " ");
//            System.out.print(min);
        }
        // 배열의 최대값과 최소값을 출력
        System.out.print(max + " ");
        System.out.print(min);
        sc.close();
    }
}
