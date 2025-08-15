package main.java.workbook2.methods;

import java.util.Scanner;

public class Q3 {       // 두 배열 합 addArrays
    // TODO: addArrays 메서드 작성

    /**
     * 메서드 이름: addArrays
     * 매개변수: int[] a, int[] b (길이가 같다고 가정)
     * 반환형: int[] (각 인덱스별로 더한 새 배열)
     * 규칙: result[i] = a[i] + b[i]
     */

    public static int[] addArrays(int[] a, int[] b) {
        // 보통은 길이 검증을 하지만, 문제 조건상 "같다"고 가정
        int n = a.length;
        int[] result = new int[n]; // 새로운 배열에 합을 저장

        // i를 0부터 n-1까지 반복하면서 같은 위치의 원소를 더한다
        for (int i = 0; i < n; i++) {
            result[i] = a[i] + b[i];
        }
        return result; // 새 배열을 반환
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 형식:
        // n
        // (다음 줄) n개의 정수 -> arr1
        // (다음 줄) n개의 정수 -> arr2

        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        // TODO: addArrays 호출 후 결과 배열 출력

        int[] sum = addArrays(arr1, arr2);

        // 결과 출력 (공백으로 구분)
        for (int i = 0; i < n; i++) {
            if (i > 0) System.out.print(" "); // 출력 형식 맞추기: 요소 사이에만 공백
            System.out.print(sum[i]);
        }
        System.out.println();

        sc.close();
    }
}
