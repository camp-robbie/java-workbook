package main.java.workbook2.array;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        // TODO: arr에 값 저장 후 버블 정렬 구현, 정렬된 배열 출력

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        // 버블 정렬
        for (int i = 0; i < n - 1; i++) {   // 전체 회전: 마지막 값은 자연 정렬 되므로 제외(n - 1번)
            for (int j = 0; j < n - 1 - i; j++) {   // 각 회전 swap
                if (arr[j] > arr[j + 1]) {  // 만약 왼쪽 값 > 오른쪽 값이면 두 값 위치 swap
                    int temp = arr[j];  // swap
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // 출력
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if ( i != n - 1) {
                System.out.print(" ");
            }
        }

        System.out.println();

        sc.close();

    }
}