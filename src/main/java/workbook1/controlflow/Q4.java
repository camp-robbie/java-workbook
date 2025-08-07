package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO: 0이 나올 때까지 양수만 합산하는 코드 작성
        // while 문을 사용하고, 입력값이 0이면 즉시 반복을 종료
        boolean notZero = true; // 입력 값이 0이 아닌 동안 반복하기 위해 사용하는 변수 (while에 그냥 true 써도 되지만 그렇게 하는 건 별로 안좋다고 들었던 것 같음)
        int sum = 0;            // 양수 합을 구하기 위한 변수
        while(notZero) {        // norZero가 true일 동안 반복을 수행함
            int num = sc.nextInt(); // num을 입력받음
            if(num > 0) {           // num이 0보다 크다면(양수라면)
                sum += num;         // sum = sum + num;
            } else if(num == 0) {   // num이 0이라면
                notZero = false;    // 반복을 종료하기 위해 notZero를 false로 변경함
            }
        }
        System.out.println(sum);    // 양수 합계를 출력함
    }
}