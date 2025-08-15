package main.java.workbook2.array;

import java.util.Scanner;

/**
 * Q2: 실수 10개를 입력받아 배열에 저장하면서 최대/최소를 추적합니다.
 * - 최대/최소는 입력과 동시에 갱신(한 번의 순회로 해결)
 * - 출력 형식: "max min"
 */

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] arr = new double[10];
        // TODO: arr에 값 저장 후 최대값과 최소값 출력

        // 처음 값을 읽을 때는 max/min 초기화가 필요하므로 따로 처리
        arr[0] = sc.nextDouble();
        double max = arr[0];
        double min = arr[0];

        // 나머지 9개 입력 + 최대/최소 갱신
        for (int i = 1; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }

        // 기본 출력(자연스러운 소수 표현). 필요하면 printf로 포맷 지정 가능
        System.out.println(max + " " + min);
    }
}
