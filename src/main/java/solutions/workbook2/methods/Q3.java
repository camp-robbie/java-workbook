package main.java.solutions.workbook2.methods;

import java.util.Scanner;

public class Q3 {

    public static int[] addArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] + arr2[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        // addArrays 호출 후 결과 배열 출력
        int[] result = addArrays(arr1, arr2);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {  // 마지막 요소가 아니면 공백 추가
                System.out.print(" ");
            }
        }

        sc.close();

    }
}

/*
1. **addArrays 메서드**:
    - `public static int[] addArrays(int[] arr1, int[] arr2)`: 두 개의 정수 배열을 매개변수로 받고 정수 배열을 반환
    - `int[] result = new int[arr1.length]`: 결과를 저장할 새로운 배열 생성 (길이는 입력 배열과 동일)
    - `for` 반복문으로 각 위치의 요소들을 더해서 `result` 배열에 저장
    - `return result`: 계산된 결과 배열을 반환

2. **main 메서드**:
    - 배열 크기 `n`을 입력받고 두 개의 배열 `arr1`, `arr2` 생성
    - 첫 번째 배열과 두 번째 배열의 요소들을 각각 입력받음
    - `addArrays(arr1, arr2)` 메서드를 호출하여 결과 배열을 받음
    - 결과 배열의 모든 요소를 공백으로 구분하여 출력

**메서드의 동작 과정**:
- 입력: `arr1 = [1, 2, 3]`, `arr2 = [4, 5, 6]`
- 계산: `result[0] = 1+4 = 5`, `result[1] = 2+5 = 7`, `result[2] = 3+6 = 9`
- 반환: `[5, 7, 9]`

예시 입력에 대해 `addArrays` 메서드가 호출되어 `5 7 9`가 출력됩니다.

 */