package main.java.workbook2.array;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            double[] arr = new double[10];
            // TODO: arr에 값 저장 후 최대값과 최소값 출력

            arr[0] = sc.nextDouble();

            // 입력 받기 전 초기 값은 double 이라 0.0
            // max, min 초기 값 설정
            double max = arr[0];
            double min = arr[0];

            for (int i = 1; i < arr.length; i++) { // 9번 반복
                arr[i] = sc.nextDouble(); // 실수를 입력 고로 double

                if (arr[i] > max) { // 가장 큰 수 찾는 로직
                    max = arr[i]; // max에 값을 덮어쓴다.
                }
                if (arr[i] < min) { // 가장 작은 수 찾는 로직
                    min = arr[i]; // min에 값을 덮어쓴다.
                }
            }

            // 예시 출력과 비슷하게 출력
            System.out.print("가장 큰 수는 = " + max + " ");
            System.out.print("가장 작은 수는 = " + min);
        } catch (InputMismatchException e) { // 숫자 이외의 입력을 할 시
            System.out.println("숫자만 입력해주세요!"); // 예외처리
        } finally {
            sc.close(); // 자원 누수 방지
        }
    }
}
