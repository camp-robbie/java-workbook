package main.java.workbook2.array;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        // TODO: arr에 n개의 정수 저장 후 역순으로 출력

        // 역순으로 입력 받기
        for (int i = n - 1; i >= 0; i--) {
            arr[i] = sc.nextInt();
        }

        // 출력
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i != arr.length - 1) {
                System.out.print(" ");
            }
        }

        System.out.println();

        sc.close();

    }
}