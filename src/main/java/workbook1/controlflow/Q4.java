package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: 0이 나올 때까지 양수만 합산하는 코드 작성
        int sum = 0;                   // 양수 합계 저장 변수 sum 선언 (초기값 : 0)

        while (true) {                 // 조건이 항상 참 -> 무한 반복 => 탈출 위해 break/return 필요!
            int num = sc.nextInt();    // 숫자(정수) 입력받아 num에 저장

            if (num == 0) {            // num 이 0 이면, 조건문(if) 실행하여
                break;                 // 반복문(while) 탈출!
            }else if (num > 0){        // num이 양수면, 조건문(else if) 실행하여
                sum += num;            // sum 에 num 값 합산!
            }
        }
        System.out.println(sum);       // 최종 합계 출력 (양수 합계)
    }
}