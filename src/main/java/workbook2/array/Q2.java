package main.java.workbook2.array;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];

        // TODO: arr에 값 저장 후 최대값과 최소값 출력
        // 10개의 실수를 입력받아 배열에 저장하고, 배열의 최대값과 최소값을 출력하는 프로그램을 작성
        // 10개의 실수라고 주어졌으니 count 만들지 않고 10을 for문에 사용함
        for (int i = 0; i < 10; i++) {      // i는 0이고, i가 10보다 작을동안 반복 수행
            double num = sc.nextDouble();   // 숫자를 입력받음
            arr[i] = num;                   // arr[i]에 입력받은 숫자를 저장함
        }

        double maxNum = arr[0];     // maxNum에 arr[0] 값을 저장함
        double minNum = arr[0];     // minNum에 arr[0] 값을 저장함

        for (int i = 1; i < 10; i++) {  // i는 1이고, i가 10보다 작을동안 반복 수행
            if (maxNum < arr[i]) {      // arr[i]가 maxNum보다 크다면
                maxNum = arr[i];        // maxNum에 arr[i] 값을 저장함
            }

            if (minNum > arr[i]) {      // arr[i]가 minNum보다 작다면
                minNum = arr[i];        // minNum에 arr[i] 값을 저장함
            }
        }
        System.out.println(maxNum + " " + minNum);  // 결과를 확인하기 위해 출력함
    }
}
