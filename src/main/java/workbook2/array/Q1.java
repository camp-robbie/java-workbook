package main.java.workbook2.array;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        // TODO: arr에 5개 정수 저장 후 출력

        //입력
        System.out.println("Enter five array elements:");

        // 최대값을 arr.length 로 지정하여, 마지막 인덱스까지 반복되게 한다.
        for (int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt(); // scanner 로 부터 정수 입력 받아, arr[i] 에 저장.
            System.out.println(arr[i] + " ");
        }
    }
}
