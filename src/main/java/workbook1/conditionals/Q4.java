package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        // TODO: 윤년 판별 로직 구현
        // 윤년은 연도가 4의 배수이면서 100의 배수가 아니거나 400의 배수인 해

        if(year % 4 == 0 && year % 100 != 0) {      // year이 4의 배수이면서 100의 배수가 아닐 경우
            System.out.println("윤년");              // 윤년을 출력함
        } else if(year % 400 == 0) {                // year이 400의 배수라면
            System.out.println("윤년");              // 윤년을 출력함
        } else {                                    // 이외에는
            System.out.println("윤년이 아닙니다. (평년)");   // 윤년이 아닙니다. (평년)을 출력함
        }
    }
}
