package main.java.workbook2.methods;

import java.util.Scanner;

public class Q3 {
    // TODO: addArrays 메서드 작성
    // sumArrays 메서드  -> 두 배열의 같은 인덱스의 요소끼리 더해 새로운 배열로 반환
    public static int[] sumArrays(int[] arr1, int[] arr2){      // sumArrays 메서드 선언
        int[] sumArr = new int[arr1.length];                    // 결과 저장할 sumArr 배열 생성 (길이는 arr1과 동일)
        for(int i=0;i<arr1.length;i++){                         // SumArr 배열 요소에 arr1 + arr2 요소 합계 (각 인덱스의 요소 합산)
            sumArr[i]=arr1[i]+arr2[i];
        }
        return sumArr;                                          // sumArr 배열 반환
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];      // 첫 번째 정수 배열 생성 (길이 n)
        int[] arr2 = new int[n];      // 두 번째 정수 배열 생성 (길이 n)

        // 첫 번째 배열 요소 입력받아 저장
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        // 두 번째 배열 요소 입력받아 저장
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        // TODO: addArrays 호출 후 결과 배열 출력

        // sumArrays 메서드 호출 -> 결과 배열 반환받아 result 에 저장
        int [] result = sumArrays(arr1, arr2);

        // 결과 배열 출력
        for (int num : result) {
            System.out.print(num + " ");
        }
        // 입력 닫기
        sc.close();
    }
}
