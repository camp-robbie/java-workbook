package main.java.workbook2.array;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: arr에 값 저장 후 버블 정렬 구현, 정렬된 배열 출력

        System.out.println("정수 개수 N을 입력해주세요: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println(n + "개의 정수를 입력해주세요 (한 칸 띄어쓰기로 구분해주세요): ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        /*
         * 버블 정렬 설명:
         * - 옆에 있는 두 값을 비교하여 큰 값을 뒤로 보냄
         * - 한 바퀴가 끝날 때마다 가장 큰 값이 맨 뒤로 확정됨
         * - 바깥 for문(i): 몇 바퀴 도는지 (n-1번 반복)
         * - 안쪽 for문(j): 현재 바퀴에서 비교할 범위 (뒤쪽 확정된 값은 비교 제외)
         */

        /* 변수 설명:
        * i = 전체 반복 회차
        * j = 현재 비교 인덱스
        * n - 1 - i = 비교 범위 줄이기
         */

        /// 버블 정렬 구현
        for (int i = 0; i < n - 1; i++) {       // i=0이면 전체, i=1이면 마지막 1개 빼고 비교
            for (int j = 0; j < n - 1 - i; j++) {

                // 현재 값(arr[j])이 다음 값(arr[j+1])보다 크면 위치 변경
                if (arr[j] > arr[j + 1]) {
                    // 두 값을 교환
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // 정렬된 배열 출력
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}