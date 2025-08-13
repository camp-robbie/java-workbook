package main.java.workbook2.methods;

import java.util.Scanner;

public class Q3 {
    // TODO: addArrays 메서드 작성
    public static int[] addArrays(int[] arr1, int[] arr2) {
        int[] sumArr = new int[arr1.length]; // 결과 배열 생성

        for (int i = 0; i < arr1.length; i++) {
            sumArr[i] = arr1[i] + arr2[i]; // 같은 인덱스끼리 더함
        }
        return sumArr;              // sumArr 배열 반환
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();       // 배열 길이

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        // 첫 번째 배열 입력
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        // 두 번째 배열 입력
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        // TODO: addArrays 호출 후 결과 배열 출력

        // 메서드 호출
        int[] result = addArrays(arr1, arr2);

        // 결과 출력
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
