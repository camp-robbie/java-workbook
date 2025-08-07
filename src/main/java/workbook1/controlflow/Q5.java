package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // TODO: 각 자리수의 합을 반복해 한 자리 수가 될 때까지 계산 후 출력
        // 반복문과 조건문을 조합하여 자리수 합을 반복 계산
        boolean isNotOne = true;    // 한 자리수가 아닌 동안 반복하기 위한 변수
        int sum = 0;                // 합계를 구할 변수

        while (isNotOne) {          // isNotOne이 true인 동안 반복함
            while(num > 0) {        // num이 0보다 클 동안 반복함
                int endNum = num % 10;      // endNum에 num을 10으로 나눈 나머지를 저장함 (끝자리)
                sum += endNum;              // sum = sum+ endNum;
                num /= 10;                  // num = num / 10;
            }

            if(sum < 10) {          // sum이 10보다 작다면(한 자리수 라면)
                isNotOne = false;   // isNotOne을 false로 변경하여 반복을 종료함
            } else {                // 그렇지 않다면 (한 자리수가 아니라면)
                num = sum;          // num에 sum을 대입함
                sum = 0;            // sum은 0으로 변경함
            }
        }
        System.out.println(sum);    // 결과를 출력함
    }
}