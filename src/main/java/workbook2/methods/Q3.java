package main.java.workbook2.methods;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q3 {
    // TODO: addArrays 메서드 작성
    // 반환형은 int[], 매개변수는 두 개의 int[]
    public int[] addArrays(int[] array1, int[] array2) {
        int[] sumArray = new int[array1.length]; // 결과를 담을 배열 생성

        for (int i = 0; i < array1.length; i++) { // 배열의 길이 만큼 반복
            sumArray[i] = array1[i] + array2[i]; // 두 배열의 합
        }

        return sumArray; // 결과 반환
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt(); // 배열의 길이 입력

            if (n == 0) { // n이 0이라면
                throw new IllegalArgumentException(); // 예외 생성
            }

            int[] arr1 = new int[n]; // 첫번째 배열
            int[] arr2 = new int[n]; // 두번째 배열

            for (int i = 0; i < n; i++) { // 배열의 크기만큼 반복
                arr1[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) { // 배열의 크기만큼 반복
                arr2[i] = sc.nextInt();
            }

            // TODO: addArrays 호출 후 결과 배열 출력
            Q3 sumArrays = new Q3(); // 객체 생성

            int[] result = sumArrays.addArrays(arr1, arr2); // 메서드 호출

            for (int i = 0; i < result.length; i++) { // 배열의 크기 만큼 반복
                System.out.print(result[i] + " "); // 출력 예시와 맞게 출력
            }
        } catch (InputMismatchException e) { // 숫자 이외의 값을 입력 시
            System.out.println("숫자만 입력해 주세요!"); // 예외 처리
        } catch (IllegalArgumentException e) { // 0을 입력 값으로 받을 시
            System.out.println("0을 입력하실 수 없습니다."); // 예외 처리
        } finally { // 항상 실행
            sc.close(); // 자원 누수 방지
        }
    }
}
