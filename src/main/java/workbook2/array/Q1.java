package main.java.workbook2.array;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        // TODO: arr에 5개 정수 저장 후 출력

        //5개의 정수 입력
        for (int i = 0; i < 5; i++) {
            //입력받고 배열에 저장
            arr[i] = sc.nextInt();
        }
        //정수 5개를 한줄에 공백을 두고 차례로 출력
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
