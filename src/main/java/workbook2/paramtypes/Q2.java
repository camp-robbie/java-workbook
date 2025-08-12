package main.java.workbook2.paramtypes;

import java.util.Scanner;

public class Q2 {
    // void를 사용한 이유
    // 1. 해당 메서드가 실행되면, 참조형 변수인 배열에 대해 연산이 진행됨.
    // 2. 배열은 참조형 변수이고, return이 없이도 값이 저장됨.
    public static void addHundred(int[] arr){

        arr[0] = arr[0]+100;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 메서드 호출함.
        addHundred(arr);

        // 출력을 위한 for 문입니다. 향상된 for문 사용함.
        for (int i : arr){
            System.out.print(i+" ");
        }
    }
}