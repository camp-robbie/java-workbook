package main.java.workbook2.array;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // n개의 정수를 입력받습니다. -> 입력과 배열 초기화 하는 구문
        int n = sc.nextInt();
        int[] arr = new int[n];

        // 버블 정렬이란? 거품이 어쩌구.. 하는 모양이라고 해서 버블 정렬.
        // 오름차순으로 정렬합니다.

        // 1. 입력 받는 구문
        // 반복문을 사용해 배열에 저장합니다.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // 2. 버블 정렬 알고리즘
        // 역순으로 도는 for문 입니다.
        // 사유 : 버블 정렬의 비교는 한 번 진행하고 마지막 요소에 정렬된 값을 할당함.
        // -> 마지막 요소는 정렬할 필요가 없음. (이미 sort됨.)
        for (int i = arr.length -1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                // j와 j+1를 비교합니다.
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        // 3. 출력합니다.
        // 향상된 for문 사용합니다.
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
}