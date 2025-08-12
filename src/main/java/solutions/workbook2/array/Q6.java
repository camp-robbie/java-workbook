package main.java.solutions.workbook2.array;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];

        int num = 1; // 채워넣을 숫자

        // 스네이크 패턴으로 배열 채우기
        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {  // 짝수 행 (0, 2, 4...): 왼쪽에서 오른쪽으로
                for (int j = 0; j < cols; j++) {
                    arr[i][j] = num++;
                }
            } else {  // 홀수 행 (1, 3, 5...): 오른쪽에서 왼쪽으로
                for (int j = cols - 1; j >= 0; j--) {
                    arr[i][j] = num++;
                }
            }
        }

        // 배열 출력
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j]);
                if (j < cols - 1) {  // 같은 행에서 마지막 요소가 아니면 공백 추가
                    System.out.print(" ");
                }
            }
            System.out.println();  // 한 행이 끝나면 줄바꿈
        }

        sc.close();

    }
}

/*
1. **변수 초기화**:
    - `num = 1`: 배열에 채워넣을 숫자를 1부터 시작

2. **스네이크 패턴으로 배열 채우기**:
    - **짝수 행** (`i % 2 == 0`): 0, 2, 4... 행은 왼쪽에서 오른쪽으로 (`j = 0`부터 `cols-1`까지)
    - **홀수 행** (`i % 2 == 1`): 1, 3, 5... 행은 오른쪽에서 왼쪽으로 (`j = cols-1`부터 `0`까지)
    - 각 위치에 `num++`을 사용하여 순차적으로 숫자를 증가시키면서 채움

3. **패턴 동작 과정** (3행 4열 예시):
    - 0행: 왼쪽→오른쪽 `1 2 3 4`
    - 1행: 오른쪽→왼쪽 `8 7 6 5`
    - 2행: 왼쪽→오른쪽 `9 10 11 12`

4. **출력**:
    - 2차원 배열을 행별로 출력하되, 같은 행 내에서는 공백으로 구분

입력 `3 4`에 대해 위와 같은 스네이크 패턴이 생성되어 출력됩니다.

*/