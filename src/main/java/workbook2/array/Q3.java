package main.java.workbook2.array;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        // TODO: arr에 n개의 정수 저장 후 역순으로 출력

        // 정수를 배열에 저장
        for (int i = 0; i < n; i++){
            arr [i] = sc.nextInt();
        }
        //역순으로 출력
        for (int i = n - 1; i >= 0; i--)
            System.out.println(arr[i]+ " ");
    }
}
