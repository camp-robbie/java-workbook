package main.java.workbook2.array;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        //arr 배열에 실수 값 10개 입력받기
        for(int i =0; i<10; i++){
            arr[i] = sc.nextDouble();
        }
        // 최대값과 최소값 출력
        double max = arr[0];
        double min = arr[0];

        for(int j = 0; j<10; j++){
            if(max<arr[j]){
                max = arr[j];
            }
            if(min>arr[j]){
                min = arr[j];
            }
        }
        System.out.println(max + " " + min);
    }
}
