package main.java.workbook2.array;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        // TODO: arr에 값 저장 후 버블 정렬 구현, 정렬된 배열 출력
        // N개의 정수를 입력받아 배열에 저장한 후, 버블 정렬 알고리즘을 사용하여 오름차순으로 정렬하고 정렬된 배열을 출력하는 프로그램을 작성하시오.

        // 1. 배열에 값 입력 받기 (몇 개의 정수를 입력 받을지 결정)
        for(int i = 0; i < n; i ++){
            arr[i] = sc.nextInt();
        }
        //2. 버블 정렬 구현 (오름차순)
        //버블 정렬은 인접한 두 원소를 비교해서 순서가 잘못된 경우 서로 바꾸는 작업을 반복.
        // j가 n - 1 - i 가 될때까지 j++ 반복한다.
        for (int i = 0; i < n; i++ ){
            for (int j = 0; j < n -1 -i; j++){

                // 현재 j 값을 temp 에 저장 후, j+1 위치로 변수 위치 변경.
                if ( arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        // 3. 정렬된 배열 출력
        for(int i = 0; i < n; i ++){
            System.out.println(arr[i]+" ");
        }


    }
}