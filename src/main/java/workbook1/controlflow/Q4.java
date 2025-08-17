package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        // TODO: 0이 나올 때까지 양수만 합산하는 코드 작성

        Scanner sc = new Scanner(System.in);
//        int numbers = sc.nextInt();
//
//        int positiveSum = 0;
//
//        while (true) {
//            if (numbers == 0) {
//                break;
//            }
//            positiveSum += numbers;
//        }
//        System.out.println(positiveSum);

        // 이렇게 작성한 경우는 numbers 변수를 while 안에서 다시 입력받지 않았기 때문에 계속 3만 더해지게 된다.
        // 반복문 안에서 계속 새로 입력 받게 코드를 고쳐야 한다.

        int positiveSum = 0;

        while (true) {
            int numbers = sc.nextInt();
            if (numbers == 0) {
                break;
            } else if (numbers > 0) {
                positiveSum += numbers;
            }
        }
        System.out.println(positiveSum);


    }
}