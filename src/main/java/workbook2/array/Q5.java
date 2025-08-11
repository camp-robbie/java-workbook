package main.java.workbook2.array;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // TODO: arr에 값 저장 후 버블 정렬 구현, 정렬된 배열 출력
        // N개의 정수를 입력받아 배열에 저장한 후, 버블 정렬 알고리즘을 사용하여 오름차순으로 정렬하고 정렬된 배열을 출력하는 프로그램을 작성하시오.
        // 버블 정렬 알고리즘을 직접 구현합니다.
        // 버블 정렬(Bubble Sort)알고리즘 : 인접한 두 요소를 반복적으로 비교하여, 잘못된 순서일 경우 서로 교환(swap)함으로써 배열을 정렬하는 알고리즘

        // N개의 정수를 입력받아 배열에 저장
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 버블 정렬 알고리즘을 사용하여 오름차순으로 정렬
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) { // 앞의 값이 크면 교환
                    int temp = arr[j]; // temp : 임시 변수
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp; // arr[j+1]에 temp 값 대입 → swap
                }
            }
        }
        // 정렬된 배열을 출력
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}