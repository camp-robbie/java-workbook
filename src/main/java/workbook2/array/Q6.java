package main.java.workbook2.array;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int rows = sc.nextInt(); // 행
            int cols = sc.nextInt(); // 열
            int[][] arr = new int[rows][cols];
            // TODO: 스네이크 패턴으로 arr 채우고 출력

            int num = 1; // 1부터 시작
            for (int i = 0; i < rows; i++) { // 행의 길이 만큼 반복
                if (i % 2 == 0) { // 짝수 행일 때
                    // 예시 배열의 크기가 4라면 [0][1][2][3] 이렇게 저장됨.
                    for (int j = 0; j < cols; j++) {
                        arr[i][j] = num++; // 숫자 +1씩 증가
                    }
                } else { // 홀수 행일 때
                    // cols -1의 이유는 배열은 0부터 시작하기 때문이다.
                    // 예시 배열의 크기가 4라면 [3][2][1][0] 이렇게 저장됨.
                    // j--를 하면서 배열의 주소를 바꾼다.
                    // 0 이하로 가지 못하게 조건을 설정하여 자동 종료.
                    for (int j = cols - 1; j >= 0; j--) {
                        arr[i][j] = num++; // 숫자 +1씩 증가
                    }
                }
            }

            // 출력 예시와 같게 조건 작성
            for (int i = 0; i < rows; i++) { // 행
                for (int j = 0; j < cols; j++) { // 열
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println(); // 줄 변경
            }

        } catch (InputMismatchException e) { // 숫자 이외의 값을 입력 시
            System.out.println("숫자만 입력해주세요!"); // 예외 처리
        } finally { // 항상 실행
            sc.close(); // 자원 누수 방지
        }
    }
}