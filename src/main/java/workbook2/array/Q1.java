package main.java.workbook2.array;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        //arr에 5개 정수 저장
        for(int i = 0; i<5; i++){
            arr[i] = sc.nextInt();
        }
        //배열의 모든 요소를 공백으로 구분하여 출력
        for(int j = 0; j<5; j++){
            String str = String.valueOf(arr[j]);     //배열 arr[j]값을 문자열로 변환
            System.out.print(str + " ");
        }
        sc.close();         // 스캐너 닫기
    }
}
