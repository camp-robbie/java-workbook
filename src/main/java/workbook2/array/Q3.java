package main.java.workbook2.array;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // TODO: arr에 n개의 정수 저장 후 역순으로 출력
        for(int i = arr.length - 1; i >= 0; i--) {  // i가 arr.length - 1이고, i가 0보다 크거나 같을 동안 1씩 감소시키며 반복 수행
            int num = sc.nextInt();                 // 숫자 입력받기
            arr[i] = num;                           // arr[i]에 num을 저장함
        }

        for (int i : arr) {                         // 향상된 for문으로 반복
            System.out.print(i + " ");              // 결과 출력
        }
    }
}