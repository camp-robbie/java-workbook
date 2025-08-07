package main.java.workbook2.array;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        // TODO: arr에 값 저장 후 최대값과 최소값 출력

        //실수 10개 입력받고 배열에 저장
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextDouble();
        }
        //최솟값과 최댓값을 저장할 변수 초기값 선언
        double min = arr[0];
        double max = arr[0];
        //배열의 첫번째 값부터 비교하여 최소, 최댓값을 구하는 for문 작성
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        //아래와 같이 향상된 for문으로 대체 가능하다
        //for (double v : arr) {
        //   if (v < min) min = v;
        //   if (v > max) max = v;
        //}
        System.out.println(max + " " + min);
        sc.close();
    }
}
