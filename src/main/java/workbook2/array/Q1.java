package main.java.workbook2.array;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5]; // 크기가 5인 정수형 배열 선언

        try{
            // TODO: arr에 5개 정수 저장 후 출력
            for (int i = 0; i < arr.length; i++) { // 배열의 길이 만큼 입력 받기
                arr[i] = sc.nextInt();
            }

            System.out.println("저장된 숫자 = ");
            for (int i = 0; i < arr.length; i++) { // 배열 안에 있는 숫자를 하나씩 출력
                System.out.print(arr[i]+" "); // 출력 예시에 맞게 출력 조정
            }
        } catch (InputMismatchException e){ // 숫자 이외의 입력을 할 시
            System.out.println("숫자만 입력해주세요!"); // 예외처리
        } finally{ // 항상 실행
            sc.close(); // 자원 누수 방지
        }

    }
}
