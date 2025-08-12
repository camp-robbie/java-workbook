package main.java.solutions.workbook2.array;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];

        // 10개의 실수를 배열에 저장
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextDouble();
        }

        // 첫 번째 값으로 최대값과 최소값 초기화
        double max = arr[0];
        double min = arr[0];

        // 배열을 탐색하면서 최대값과 최소값 갱신
        for (int i = 1; i < 10; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // 최대값과 최소값 출력
        System.out.println(max + " " + min);

        sc.close();

    }
}

/**
 * **코드 설명:**
 * 1. **입력 부분**:
 *     - `for (int i = 0; i < 10; i++)` 반복문으로 10개의 실수 입력
 *     - `arr[i] = sc.nextDouble()`로 double형 배열에 저장
 *
 * 2. **최대값, 최소값 찾기**:
 *     - `max`와 `min`을 배열의 첫 번째 값 `arr[0]`으로 초기화
 *     - `for (int i = 1; i < 10; i++)` 반복문으로 두 번째 요소부터 비교
 *     - `arr[i] > max`이면 `max` 갱신
 *     - `arr[i] < min`이면 `min` 갱신
 *
 * 3. **출력**:
 *     - 최대값과 최소값을 공백으로 구분하여 출력
 */