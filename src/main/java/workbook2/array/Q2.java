package main.java.workbook2.array;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] arr = new double[10];

        // 값을 할당하는 반복문
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextDouble();
        }

        // 배열의 내부 요소끼리 비교 할 것이기 때문에,
        // 배열의 0번째 요소로 초기화합니다.
        double min = arr[0];
        double max = arr[0];

        // 조건 : 반복문을 사용하여 배열을 탐색하며 최대, 최소를 구합니다.
        // 비교를 i+1과 할 것이기 때문에, 배열의 길이 -1 번 만큼 반복합니다.
        for (int i = 1; i < arr.length; i++) {
            // 만약 min보다 작은 값이라면, 자동적으로 max의 조건이 아님.
            // 그러므로, max인지 판단하는 조건문을 else if로 처리합니다.
            if(min > arr[i]){
                min = arr[i];
            } else if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println(max+" "+min);
    }
}
