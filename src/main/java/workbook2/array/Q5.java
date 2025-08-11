package main.java.workbook2.array;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // TODO: arr에 값 저장 후 버블 정렬 구현, 정렬된 배열 출력

        for(int i = 0; i < arr.length; i++) {   // i는 0이고, i가 arr.length보다 작을동안 1씩 증가시키며 반복 수행
            arr[i] = sc.nextInt();              // arr[i] 입력받은 값을 저장함
        }

        for(int i = 0; i < arr.length - 1; i++) {       // i는 0이고, i가 arr.length보다 작을동안 1씩 증가시키며 반복 수행
            for(int j = 1; j < arr.length - i; j++) {   // j는 1이고, j가 arr.length - i보다 작을동안 1씩 증가시키며 반복 수행
                if (arr[j] < arr[j-1]) {                // arr[j]보다 arr[j-1]이 크다면
                    int temp = arr[j-1];                // temp는 arr[j-1]을 저장함
                    arr[j-1] = arr[j];                  // arr[j-1]은 arr[j]를 저장함
                    arr[j] = temp;                      // arr[j]는 tem를 저장함 -> 이 3개의 과정이 자리를 바꾸는 과정
                }
            }
        }

        for(int i = 0; i < arr.length; i++) {       // i는 0이고, i가 arr.length보다 작을동안 1씩 증가시키며 반복 수행
            System.out.print(arr[i] + " ");         // 출력함
        }
    }
}