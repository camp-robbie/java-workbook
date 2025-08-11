package main.java.workbook2.array;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        // TODO: arr에 n개의 정수 저장 후 역순으로 출력

        //입력받은 정수 n의 크기를 갖는 배열 생성
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //배열의 n번째 항부터 1번째 항까지 역순으로 출력
        for (int i = n-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}