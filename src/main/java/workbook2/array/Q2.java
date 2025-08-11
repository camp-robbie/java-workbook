package main.java.workbook2.array;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        // TODO: arr에 값 저장 후 최대값과 최소값 출력

        System.out.print("실수 5개를 입력해주세요(한 칸 띄어쓰기로 구분해주세요): ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
        }

        // 배열의 최댓값과 최솟값을 출력하세요.
        // 0으로 하면 음수 입력 시 오류 가능 → 첫 요소로 초기화

        double max = arr[0];
        double min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }

        System.out.println("최댓값: "+ max + " " + "최솟값: " + min);
    }
}
