package main.java.workbook2.array;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 배열의 크기를 입력받음
        int n = sc.nextInt();
        // 입력받은 크기 만큼의 배열을 선언함.
        int[] arr = new int[n];

        // 입력받는 반복문입니다.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // 역순으로 출력하는 반복문입니다.
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}