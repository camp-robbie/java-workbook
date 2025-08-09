package main.java.workbook1.breakcontinue;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: 음수가 나오면 break, 양수 평균 출력

        int sum = 0;
        int count = 0;

        // 첫 번째 시도 - count를 어떻게 써야할지 모르겠다, , ,
//        while (true) {
//            int inputNum = sc.nextInt();
//            if (inputNum > 0) {
//                sum += inputNum;
//            } else {
//                break;
//            }
//            avg = sum / inputNum;
//            System.out.println(avg);
//        }

        // 두 번째 시도 - 지피티 도움 받아서 성공
        while(true) {
            int inputNum = sc.nextInt();
            if (inputNum < 0) {
                break;
            }
            sum += inputNum;
            count++;
        }

        if (count > 0) {
            double avg = (double) sum / count;
            System.out.println(avg);
        }
    }
}