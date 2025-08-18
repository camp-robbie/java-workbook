package main.java.workbook2.array;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        // TODO: arr에 값 저장 후 최대값과 최소값 출력


        System.out.println("Enter ten array elements:");

        //1.값 입력 (실수 double)
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
        }

        // 2. 최대값과 최소값 초기화 (배열을 훑을때 기준이 도니느 값을 처음에 설정)
        double max = arr[0];
        double min = arr[0];

        //3.배열 전체를 돌면 최대/최소 찾기
        //인덱스는 언제나 정수(int) 여야함.
        for (int i = 1; i < arr.length; i++) {

            //기존에 저장된 max, min 과 현재 배열 요소 arr[i] 를 비교해서, 둘중 더 큰 값 또는 작은 겂을 저장.
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        // 4. 결과 출력
        System.out.println(max + " " + min);
    }
}

