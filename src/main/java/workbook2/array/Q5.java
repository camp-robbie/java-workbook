package main.java.workbook2.array;

import java.util.Scanner;

/**
 * Q5: 정수 N과 N개의 수를 입력받아 "버블 정렬"로 오름차순 정렬합니다.
 * - 버블 정렬 아이디어:
 *   인접한 두 수를 비교해서 (앞 > 뒤)면 교환.
 *   한 바퀴(pass)가 끝날 때마다 가장 큰 값이 배열의 오른쪽 끝으로 "떠오름".
 * - 최적화: 어떤 pass에서 한 번도 교환이 없으면 이미 정렬 완료 → 조기 종료
 * - 시간복잡도: 최악 O(N^2)
 */

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        // TODO: arr에 값 저장 후 버블 정렬 구현, 정렬된 배열 출력

        // 입력
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 버블 정렬
        for (int pass = 0; pass < n - 1; pass++) {
            boolean swapped = false; // 이번 pass에서 교환이 있었는지 기록

            // 끝에서 pass만큼은 이미 큰 값이 고정되어 있으므로 (n-1-pass)까지만 비교
            for (int i = 0; i < n - 1 - pass; i++) {
                if (arr[i] > arr[i + 1]) {
                    // 인접 원소 교환
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    swapped = true;
                }
            }

            // 한 번도 교환이 없으면 조기 종료(이미 정렬됨)
            if (!swapped) break;
        }

        // 출력
        for (int i = 0; i < n; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}