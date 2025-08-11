package main.java.workbook2.array;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        // TODO: arr에 값 저장 후 버블 정렬 구현, 정렬된 배열 출력

        // arr에 값 저장
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 버블 정렬 알고리즘 사용 -> 오름차순 정렬
        for (int i = 0; i < n; i++) {          // 모든 요소들 반복적으로 비교 가능
            for (int j = 0; j < n-1; j++) {    // 인접요소 비교 가능 (한 라운드)
                if (arr[j] > arr[j+1]){        // 요소를 비교하여
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;             // 큰값이 뒤로 갈 수있도록 정렬 (오름차순 정렬)
                }
            }
        }

        // 정렬된 배열 출력
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        // 입력닫기
        sc.close();
    }
}