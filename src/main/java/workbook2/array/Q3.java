package main.java.workbook2.array;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열 크기 N을 입력해주세요: ");
        int n = sc.nextInt();
        // TODO: arr에 n개의 정수 저장 후 역순으로 출력

        int[] arr = new int[n];
        System.out.print(n + "개의 정수를 입력해주세요 (한 칸 띄어쓰기로 구분해주세요): ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 역순 배열을 따로 만들기
        int[] reverseArr = new int[n];

        /*
         * i → arr의 마지막 인덱스부터 0까지 감소
         * j → reverseArr의 0부터 증가
         * arr[i] 값을 reverseArr[j]에 넣음

         풀어서..
         * - i: 원본 배열(arr)에서 뒤에서 앞으로 이동하는 인덱스
         * - j: 역순 배열(reverseArr)에서 앞에서 뒤로 이동하는 인덱스
         * - arr[i] 값을 reverseArr[j]에 복사


         예: arr = {1, 2, 3, 4}
         * 첫 회전: i=3, j=0 → reverseArr[0] = arr[3] // 4
         * 두 번째: i=2, j=1 → reverseArr[1] = arr[2] // 3
         * 세 번째: i=1, j=2 → reverseArr[2] = arr[1] // 2
         * 네 번째: i=0, j=3 → reverseArr[3] = arr[0] // 1
         *
         * 이렇게 한 번의 반복문으로 배열을 역순으로 복사가 가능합니다.
         */
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reverseArr[j] = arr[i];
        }

        // 결과 출력
        for (int num : reverseArr) {
            System.out.print(num + " ");
        }
    }
}