package main.java.workbook2.array;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("몇 가지의 수를 입력하시겠습니까?");
            int n = sc.nextInt();
            int[] arr = new int[n]; // 입력된 값으로 배열 크기 선언

            // TODO: arr에 n개의 정수 저장 후 역순으로 출력
            // 배열의 마지막 메모리 주소를 i의 값으로 선언
            // n - 1는 이유는 배열은 0부터 시작하기 때문
            // i--를 하면서 배열의 마지막부터 반대로 저장
            for (int i = n - 1; i >= 0; i--) {
                arr[i] = sc.nextInt(); // 입력 값을 받으면 배열에 순차적으로 저장
            }

            System.out.print("저장된 값은 = ");
            for (int i = 0; i < arr.length; i++) { // 배열의 길이 만큼 반복
                System.out.print(arr[i] + " "); // 출력 예시에 맞게 출력
            }

        } catch (InputMismatchException e) { // 숫자 이외의 입력을 할 시
            System.out.println("숫자만 입력해주세요!"); // 예외처리
        } finally { // 항상 실행
            sc.close(); // 자원 누수 방지
        }
    }
}