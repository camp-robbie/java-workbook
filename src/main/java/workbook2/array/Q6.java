package main.java.workbook2.array;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 입력값을 받고, 배열을 초기화합니다.
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];

        // 스네이크 패턴 = [1,2,3],[6,5,4]
        // 조건 : 행이 홀수번째일 때와 짝수번째일 때 출력 순서를 달리 함.

        // 할당을 위한 숫자 num 입니다.
        int num = 1;

        // for 문을 사용합니다. 행의 갯수만큼 반복하는 반복문입니다.
        for (int i = 0; i < rows; i++) {
            // if -> 지금 수정하려는 행(i)이 짝수(2로 나누어 떨어짐)라면
            if (i%2==0){
                // 배열은 0부터 시작 -> 짝수면 홀수번째 행입니다.
                for (int j = 0; j < cols; j++) {
                    // num 은 다음에 쓰일 때 무조건 +1이 되어있는 형태입니다.
                    // 증감 연산자를 통해 이를 해결합니다.
                    arr[i][j] = num++;
                }
            }else {
                for (int j = cols-1; j >=0 ; j--) {
                    arr[i][j] = num++;
                }
            }
        }

        // 출력합니다.
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}