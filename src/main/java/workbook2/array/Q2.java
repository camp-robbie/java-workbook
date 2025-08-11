package main.java.workbook2.array;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        // TODO: arr에 값 저장 후 최대값과 최소값 출력

        // 실수 10개를 입력받아 배열(arr)에 저장
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
        }

        // 최댓값 / 최솟값 초기화
        double max = arr[0];
        double min = arr[0];

        // 배열의 최대값, 최소값 구하기
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]> max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }

        // 최댓값, 최솟값 출력
        System.out.print("최댓값: "+max+" ");
        System.out.print("최솟값: "+min);

        // 입력닫기
        sc.close();
    }
}
