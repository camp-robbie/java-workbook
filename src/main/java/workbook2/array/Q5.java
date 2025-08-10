package main.java.workbook2.array;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            int[] arr = new int[n];

            // TODO: arr에 값 저장 후 버블 정렬 구현, 정렬된 배열 출력
            for (int i = 0; i < n; i++) { // 입력한 값 만큼 반복
                arr[i] = sc.nextInt(); // 입력 값을 배열에 저장
            }

            for (int i = 0; i < arr.length - 1; i++) { // 가까운 두 수를 비교하기에 반복 횟수 -1

                // 가까운 두 수를 비교하기에 반복 횟수 -1
                // -i의 이유는 아래의 반복으로 인해 가장 큰 수가 맨 끝에 저장되었기 때문에 불필요한 반복을 제거
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) { // 앞의 수가 뒤의 수보다 크다면
                        int temporary = arr[j]; // 임시 변수에 앞의 수 저장
                        arr[j] = arr[j + 1]; // 앞의 배열에 뒤의 수 저장
                        arr[j + 1] = temporary; // 뒤의 배열에 앞의 수(임시 변수의 값) 저장하며 앞과 뒤의 숫자 변경
                    }
                }
            }

            for (int i = 0; i < n; i++) { // 배열의 크기만큼
                System.out.print(arr[i] + " "); // 출력 예시에 맞게 출력
            }

        } catch (InputMismatchException e) { // 숫자 이외의 값을 입력 시
            System.out.println("숫자만 입력해주세요!"); // 예외 처리
        } finally { // 항상 실행
            sc.close(); // 자원 누수 방지
        }


    }
}