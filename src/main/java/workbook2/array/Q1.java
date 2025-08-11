package main.java.workbook2.array;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        // TODO: arr에 5개 정수 저장 후 출력

        System.out.println("5개의 정수를 입력하세요.");
        for (int i =0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            System.out.println("입력한 정수"+arr[i]+"를 출력합니다.");
        }
        sc.close();
    }
}
