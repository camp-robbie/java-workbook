package main.java.workbook2.array;

import java.util.Scanner;

/**
 * Q1: 정수 5개를 입력받아 배열에 저장하고, 공백으로 구분해 그대로 출력합니다.
 * - 배열 선언: int[] arr = new int[5];
 * - 입력: for문으로 5번 nextInt()
 * - 출력: 배열을 앞에서부터 순서대로 "한 칸 띄어쓰기"로 출력
 */

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 길이가 5인 정수 배열 준비
        int[] arr = new int[5];
        // TODO: arr에 5개 정수 저장 후 출력

        // 1) 입력 단계: 5번 읽어서 순서대로 저장
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // 2) 출력 단계: "1 2 3 4 5"처럼 공백으로 구분해서 출력
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) System.out.print(" "); // i가 0이 아닐 때만 앞에 공백 추가 → 끝에 불필요한 공백 방지
            System.out.print(arr[i]);
        }
        System.out.println(); // 줄바꿈

        // 주의: 콘솔 테스트 연속 실행을 고려해 System.in은 닫지 않는 편이 안전합니다.
        // sc.close();

    }
}
